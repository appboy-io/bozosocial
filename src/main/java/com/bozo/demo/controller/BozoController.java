package com.bozo.demo.controller;

import com.bozo.demo.common.Post;
import com.bozo.demo.dto.UserDto;
import com.sun.corba.se.spi.ior.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BozoController {
    Flux<Post> feed(String user);
    Flux<Post> feedUpdate(ObjectId objectId);
    Mono<UserDto> createUser(UserDto userDetails);
    Mono<UserDto> updateUser(UserDto userDetails);
}
