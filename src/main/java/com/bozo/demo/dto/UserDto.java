package com.bozo.demo.dto;

import org.bson.types.ObjectId;
import java.util.List;

public class UserDto {
    private ObjectId id;
    private String name;
    private List<ObjectId> friends;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ObjectId> getFriends() {
        return friends;
    }

    public void setFriends(List<ObjectId> friends) {
        this.friends = friends;
    }
}
