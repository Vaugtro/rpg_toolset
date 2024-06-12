package org.spring.rpg_toolset.application.gateways.common;

import lombok.AllArgsConstructor;
import org.spring.rpg_toolset.application.gateways.UserGateway;
import org.spring.rpg_toolset.domain.repositories.UserRepository;
import org.spring.rpg_toolset.dto.mappers.UserMapper;
import org.spring.rpg_toolset.dto.models.UserCreateRequestModel;

@AllArgsConstructor
public class UserGatewayImpl implements UserGateway {

    final UserRepository userRepository;

    @Override
    public void create(UserCreateRequestModel requestModel) {
        UserMapper user = new UserMapper(requestModel.getName(), requestModel.getPassword(), requestModel.getCreationTime());
    }
}
