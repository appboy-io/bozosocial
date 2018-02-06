package com.bozo.demo.repository;

import com.bozo.demo.common.Users;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface UsersRepository extends ReactiveMongoRepository<Users,Long> {
    Flux<Users> findAll();
    Flux<Users> findByName(String name);
}
