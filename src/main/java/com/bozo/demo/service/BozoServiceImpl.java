package com.bozo.demo.service;

import com.bozo.demo.common.Post;
import com.bozo.demo.dto.UserDto;
import com.bozo.demo.repository.PostsRepository;
import com.bozo.demo.repository.UsersRepository;
import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BozoServiceImpl implements BozoService {

    private final PostsRepository postsRepository;
    private final UsersRepository usersRepository;

    @Autowired
    public BozoServiceImpl(PostsRepository postsRepository, UsersRepository usersRepository) {
        this.postsRepository = postsRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    public Flux<Post> getFeed(String user) {
        return null;
    }

    @Override
    public Flux<Post> feedUpdate(ObjectId objectId) {
        return null;
    }

    @Override
    public Mono<UserDto> createUser(UserDto userDetails) {
        return null;
    }

    @Override
    public Mono<UserDto> updateUser(UserDto userDetails) {
        return null;
    }
}
