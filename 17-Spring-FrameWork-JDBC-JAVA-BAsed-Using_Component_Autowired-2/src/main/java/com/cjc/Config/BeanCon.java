package com.cjc.Config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.cjc")
public class BeanCon {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springframework");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		return driverManagerDataSource;
	}

	@Bean
	public JdbcTemplate template() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());

		return jdbcTemplate;

	}
}

//@Bean
//public DeveloperDao dao()
//{
//	DeveloperDao dao=new DeveloperDao();
//	dao.setTemplate(template());
//	
//	return dao;
//}
//@Bean
//public DeveloperImpl developerImpl()
//{
//	DeveloperImpl developerImpl=new DeveloperImpl();
//	developerImpl.setDao(dao());
//	return developerImpl;
//}