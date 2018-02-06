package com.bozo.demo.converter;

import com.bozo.demo.common.Users;
import com.bozo.demo.dto.UserDto;

public class UsersConverter {

    public Users convert(UserDto dto) {
        if(dto == null)
            return null;

        Users entity = new Users();
        entity.setName(dto.getName());
        entity.setId(dto.getId());
        entity.setFriends(dto.getFriends());

        return entity;
    }

    public UserDto convert(Users users) {
        if(users == null)
            return null;

        UserDto dto = new UserDto();
        dto.setId(users.getId());
        dto.setName(users.getName());
        dto.setFriends(users.getFriends());

        return dto;
    }
}
