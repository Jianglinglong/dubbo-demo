package jiang.demo.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan(basePackages = "jiang.demo.mapper")
public class MybatisConfigration {

    @Bean
    public PathMatchingResourcePatternResolver resourcePatternResolver() {
        return new PathMatchingResourcePatternResolver();
    }
    @Bean
    public SpringManagedTransactionFactory transactionFactory(){
        return new SpringManagedTransactionFactory();
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource, MyBatisProperties properties, SpringManagedTransactionFactory transactionFactory) throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(properties.typeAliasesPackage);
        sqlSessionFactoryBean.setMapperLocations(properties.getMapperLocations());
        sqlSessionFactoryBean.setConfigLocation(properties.getConfigLocation());
        sqlSessionFactoryBean.afterPropertiesSet();

        return sqlSessionFactoryBean;
    }

    @Component
    @PropertySource("classpath:mybatis.properties")
    public class MyBatisProperties {
        @Autowired
        private PathMatchingResourcePatternResolver resourcePatternResolver;
        @Value("${mybatis.mapperLocations}")
        private String mapperLocations;

        @Value("${mybatis.typeAliasesPackage}")
        private String typeAliasesPackage;
        @Value("${mybatis.configLocation}")
        private String configLocation;

        public Resource[] getMapperLocations() throws IOException {
           return resourcePatternResolver.getResources(mapperLocations);
        }

        public Resource getConfigLocation(){
            return resourcePatternResolver.getResource(configLocation);
        }
    }
}
