package com.cjc.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.cjc")
@PropertySource(value = "info.properties")
public class BeanConfi {
	@Value("${con.driver_class}")
	private String driverclass;
	@Value("${con.url}")
	private String url;
	@Value("${con.username}")
	private String username;
	@Value("${con.password}")
	private String password;

	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPass(String password) {
		this.password = password;
	}
	@Bean
	public DriverManagerDataSource ds()
	{
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName(driverclass);
		d.setUrl(url);
		d.setUsername(username);
		d.setPassword(password);
		return d;
	}
	@Bean
	public JdbcTemplate template()
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(ds());
		return template;
	}

}
