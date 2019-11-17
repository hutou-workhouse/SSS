package me.helllp.sss.authentication.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.stereotype.Component;

@Component
public class DbConfig {
	@Bean
	@ConditionalOnProperty(prefix = "sss.dbconfig",value = {"dbtype"},havingValue = "h2")
    public DataSource h2DataSource(){

        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase database = builder.setType(EmbeddedDatabaseType.H2)
        	.setName("dbtest")
        	.addScript("classpath:h2/h2schema.sql").addScript("classpath:h2/h2data.sql").build();
        return database;
    }
}
