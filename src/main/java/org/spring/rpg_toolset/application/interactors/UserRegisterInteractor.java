package org.spring.rpg_toolset.application.interactors;

import org.spring.rpg_toolset.application.boundaries.UserRegisterBoundary;
import org.spring.rpg_toolset.application.gateways.UserGateway;
import org.spring.rpg_toolset.application.presenters.UserPresenter;
import org.spring.rpg_toolset.domain.factories.UserFactory;
import org.spring.rpg_toolset.dto.models.UserCreateRequestModel;
import org.spring.rpg_toolset.dto.models.UserCreateResponseModel;

public class UserRegisterInteractor implements UserRegisterBoundary {

    final UserGateway userGateway;
    final UserPresenter userPresenter;
    final UserFactory userFactory;

    @Override
    public UserCreateResponseModel create(UserCreateRequestModel userCreateRequestModel) {

    }
}
