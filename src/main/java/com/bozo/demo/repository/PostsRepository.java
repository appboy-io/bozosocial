package com.bozo.demo.repository;

import com.bozo.demo.common.Post;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PostsRepository extends ReactiveMongoRepository<Post, Long> {
    Flux<Post> findAll();
    Flux<Post> findByUserId(ObjectId userId);
}
