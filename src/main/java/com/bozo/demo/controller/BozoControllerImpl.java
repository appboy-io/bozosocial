package com.bozo.demo.controller;

import com.bozo.demo.common.Post;
import com.bozo.demo.dto.UserDto;
import com.bozo.demo.service.BozoService;
import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin
@RestController
public class BozoControllerImpl implements BozoController {

    private final BozoService bozoService;

    @Autowired
    public BozoControllerImpl(BozoService bozoService) {
        this.bozoService = bozoService;
    }

    @Override
    @GetMapping(value = "/feed")
    public Flux<Post> feed(@RequestHeader String user) {
        return bozoService.getFeed(user);
    }

    @Override
    @GetMapping(value = "/feed/update/{postId}")
    public Flux<Post> feedUpdate(@PathVariable ObjectId postId) {
        return bozoService.feedUpdate(postId);
    }

    @Override
    @PostMapping(value = "/createuser")
    public Mono<UserDto> createUser(@RequestBody UserDto userDetails) {
        return bozoService.createUser(userDetails);
    }

    @Override
    @PostMapping(value = "/user")
    public Mono<UserDto> updateUser(@RequestBody UserDto userDetails) {
        return bozoService.updateUser(userDetails);
    }
}
