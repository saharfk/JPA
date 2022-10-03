package com.jpav2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseBeanConfig {
    @Autowired
    public AppConfig appConfig;
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUsername(appConfig.getUsername());
        dataSource.setPassword(appConfig.getPassword());
        dataSource.setUrl(
                "jdbc:oracle:thin:@" + appConfig.getJdbcURL() + ":" + appConfig.getPort() + "/" + appConfig.getServicename());

        return dataSource;
    }
}
