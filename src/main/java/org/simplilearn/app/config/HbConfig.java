package org.simplilearn.app.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.simplilearn.app.entities.Emp;

public class HbConfig {
 
	public static SessionFactory getSessionFactory() {
	Configuration configuration=new Configuration();
	configuration.setProperties(hibernateproperties());
	configuration.addAnnotatedClass(Emp.class);
		return configuration.buildSessionFactory();
	}
	private static Properties hibernateproperties() {
		Properties properties=new Properties();
		properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		properties.put(Environment.URL,"jdbc:mysql://localhost:3306/ginnidb");
		properties.put(Environment.USER,"root");
		properties.put(Environment.PASS,"Garima@1991");
		properties.put(Environment.SHOW_SQL,true);
		properties.put(Environment.FORMAT_SQL,true);
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.HBM2DDL_AUTO,"update");
		
		return properties;
	}
}
