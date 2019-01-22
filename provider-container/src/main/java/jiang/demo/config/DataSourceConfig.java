package jiang.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(DataSourceProperties properties){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(properties.url);
        druidDataSource.setPassword(properties.password);
        druidDataSource.setUsername(properties.username);
        druidDataSource.setDriverClassName(properties.driverClassName);
        druidDataSource.setInitialSize(5);
        return druidDataSource;
    }

    @Component
    @PropertySource("classpath:spring-datasource.properties")
    public class DataSourceProperties{
        @Value("${spring.datasource.url}")
        private String url;
        @Value("${spring.datasource.username}")
        private String username;
        @Value("${spring.datasource.password}")
        private String password;
        @Value("${spring.datasource.driverClassName}")
        private String driverClassName;
    }
}