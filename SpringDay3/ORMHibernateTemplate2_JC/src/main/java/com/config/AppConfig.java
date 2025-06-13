package com.config;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.dao","com.service"})
@PropertySource("db.properties")
@EnableTransactionManagement
public class AppConfig {
	 @Autowired
	   private Environment env;
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource ds=new org.springframework.jdbc.datasource.DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("db.driver"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.user"));
		ds.setPassword(env.getProperty("db.password"));
		return ds;
	}
	
	@Bean
	public HibernateTemplate hbTemplate()
	{
		HibernateTemplate template=new HibernateTemplate();
		template.setSessionFactory(getSessionFactory().getObject());
		return template;
	}

	@Bean
	   public LocalSessionFactoryBean getSessionFactory() {
	      LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
	      factoryBean.setDataSource(dataSource());
	      
	      Properties props=new Properties();
	      props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
	      props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
	      props.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
	      factoryBean.setHibernateProperties(props);
	      //factoryBean.setMappingResources("account.hbm.xml");
	      factoryBean.setAnnotatedClasses(com.data.Account.class);
	      return factoryBean;
	   }
	 
	 @Bean
	 public HibernateTransactionManager transactionManager()
	 {
		 HibernateTransactionManager hbtr=new HibernateTransactionManager();
		 hbtr.setSessionFactory(getSessionFactory().getObject());
		 return hbtr;
	 }
	
}
