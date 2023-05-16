package com.nelioalves.workshopmongo.dto;

import com.nelioalves.workshopmongo.domain.User;

import java.io.Serializable;

public class UserDto implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDto(){

    }

    public UserDto(User obj){//construtor para instanciar a partir do obj entity correspondente.
        id = obj.getId();
        id = obj.getName();
        id = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
