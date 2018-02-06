package com.bozo.demo.config;

import com.bozo.demo.constants.ApiConstants;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
public class MongoConfig extends AbstractReactiveMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return ApiConstants.DB;
    }

    @Override
    @Bean
    public MongoClient reactiveMongoClient() {
        return MongoClients.create();
    }
}
