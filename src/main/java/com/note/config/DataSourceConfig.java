package com.note.config;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dataSource.properties")
public class DataSourceConfig {

  private Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);
  @Value("${dbUrl}")
  private String dbUrl;
  @Value("${username}")
  private String username;
  @Value("${password}")
  private String password;
  @Value("${driverClassName}")
  private String driverClassName;
  @Value("${initialSize}")
  private int initialSize;
  @Value("${minIdle}")
  private int minIdle;
  @Value("${maxActive}")
  private int maxActive;
  @Value("${maxWait}")
  private int maxWait;
  @Value("${timeBetweenEvictionRunsMillis}")
  private int timeBetweenEvictionRunsMillis;
  @Value("${minEvictableIdleTimeMillis}")
  private int minEvictableIdleTimeMillis;
  @Value("${validationQuery}")
  private String validationQuery;
  @Value("${testWhileIdle}")
  private boolean testWhileIdle;
  @Value("${testOnBorrow}")
  private boolean testOnBorrow;
  @Value("${testOnReturn}")
  private boolean testOnReturn;
  @Value("${poolPreparedStatements}")
  private boolean poolPreparedStatements;
  @Value("${maxPoolPreparedStatementPerConnectionSize}")
  private int maxPoolPreparedStatementPerConnectionSize;
  @Value("{connectionProperties}")
  private String connectionProperties;


  @Bean
  public DataSource dataSource() {
    DruidDataSource datasource = new DruidDataSource();
    datasource.setUrl(this.dbUrl);
    datasource.setUsername(username);
    datasource.setPassword(password);
    datasource.setDriverClassName(driverClassName);
    //configuration
    datasource.setInitialSize(initialSize);
    datasource.setMinIdle(minIdle);
    datasource.setMaxActive(maxActive);
    datasource.setMaxWait(maxWait);
    datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
    datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
    datasource.setValidationQuery(validationQuery);
    datasource.setTestWhileIdle(testWhileIdle);
    datasource.setTestOnBorrow(testOnBorrow);
    datasource.setTestOnReturn(testOnReturn);
    datasource.setPoolPreparedStatements(poolPreparedStatements);
    datasource
        .setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
    datasource.setConnectionProperties(connectionProperties);
    return datasource;
  }
}
