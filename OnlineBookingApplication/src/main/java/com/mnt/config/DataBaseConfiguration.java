package com.mnt.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.mnt.dao.UserRegistrationDAO;
import com.mnt.repoImpl.UserRegistrationRepoImpl;

@Configuration
@PropertySource(value = {"classpath:database.properties" })
@ComponentScan(basePackages = {"com.mnt.repo*"})
public class DataBaseConfiguration 
{
	
	@Autowired
	private Environment environment;
	
	
	/* configuring the data base properties */
	
   @Bean
   public DriverManagerDataSource dataSource()
   {
	   DriverManagerDataSource dataSource=new DriverManagerDataSource();
	   dataSource.setDriverClassName(environment.getProperty("mysql.driver"));
	   dataSource.setUrl(environment.getProperty("mysql.url"));
	   dataSource.setUsername(environment.getProperty("mysql.username"));
	   dataSource.setPassword(environment.getProperty("mysql.password"));
	   return dataSource;
   }
   
	/* configuring the hibernate properties */
   
   public Properties getProperties()
   {
	   Properties properties=new Properties();
	   properties.setProperty("hibernate.dialect",environment.getProperty("hibernate.dialect"));
	   properties.setProperty("hibernate.show_sql",environment.getProperty("hibernate.show_sql"));
	   properties.setProperty("hibernate.format_sql",environment.getProperty("hibernate.format_sql"));
	   properties.setProperty("hibernate.hbm2ddl.auto",environment.getProperty("hibernate.hbm2ddl.auto"));
	   return properties;
   }
   
	/* configuring session factory */
   @Bean
   public LocalSessionFactoryBean getSessionFactory()
   {
	   LocalSessionFactoryBean factoryBean=new LocalSessionFactoryBean();
	   factoryBean.setHibernateProperties(getProperties());
	   factoryBean.setAnnotatedClasses(UserRegistrationDAO.class);
	   factoryBean.setDataSource(dataSource());
	   return factoryBean;
   }
   
	/* configuring the hibernate template */
   
   @Bean
   public HibernateTemplate ht()
   {
	   HibernateTemplate hibernateTemplate=new HibernateTemplate();
	   hibernateTemplate.setSessionFactory(getSessionFactory().getObject());
	   hibernateTemplate.setCheckWriteOperations(false);
	   return hibernateTemplate;
   }
   
   @Bean
   
	public HibernateTransactionManager htxm() {
		HibernateTransactionManager htxm=new HibernateTransactionManager();
		htxm.setSessionFactory(getSessionFactory().getObject());
		return htxm;
	}
	
   
   
   
   
   
}
