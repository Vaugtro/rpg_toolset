package org.spring.rpg_toolset.dto.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor

public class UserCreateRequestModel {

    String name;
    String password;
    LocalDateTime creationTime;

    public UserCreateRequestModel(String name, String password) {
        this.name = name;
        this.password = password;
        this.creationTime = LocalDateTime.now();
    }
}
