package org.spring.rpg_toolset.domain.factories;

import org.spring.rpg_toolset.domain.entities.User;

public interface UserFactory {
    User createUser(String name, String password);
}
