package org.spring.rpg_toolset.domain.entities.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.spring.rpg_toolset.domain.entities.User;

@Getter
@AllArgsConstructor

public class UserImpl implements User {

    private String name;
    private String password;
}
