package org.spring.rpg_toolset.dto.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserCreateResponseModel {

    String login;
    String creationTime;
}