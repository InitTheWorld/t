package jdbctest;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;


@Configuration
public class Config {

    @Bean
    public BasicDataSource basicdataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=UTC&&useOldAliasMetadataBehavior=true&&characterEncoding=utf8&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }
    @Bean
    public JdbcTemplate template(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public TaskNewService taskNewServiceService(JdbcTemplate template) {return new jdbctest.TaskNewServiceImpl(template);
    }
}
