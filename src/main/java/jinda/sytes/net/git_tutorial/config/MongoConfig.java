package jinda.sytes.net.git_tutorial.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.Arrays;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration{

    @Value("${spring.data.mongodb.username}")
    private String userName;
    @Value("${spring.data.mongodb.username}")
    private String password;
    @Value("${spring.data.mongodb.username}")
    private String database;

    @Override
    public MongoClient mongoClient() { // mongo db에 접근할 객체 반환
        MongoCredential credential = MongoCredential.createCredential(userName, database, password.toCharArray());
        return new MongoClient(new ServerAddress("localhost", 27017), Arrays.asList(credential));
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoClient(), database);
    }

}
