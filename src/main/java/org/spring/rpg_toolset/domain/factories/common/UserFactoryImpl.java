package org.spring.rpg_toolset.domain.factories.common;

import org.spring.rpg_toolset.domain.entities.common.UserImpl;
import org.spring.rpg_toolset.domain.factories.UserFactory;

class UserFactoryImpl implements UserFactory {
    @Override
    public UserImpl createUser(String name, String password) {
        return new UserImpl(name, password);
    }
}
