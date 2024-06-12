package org.spring.rpg_toolset.application.boundaries;

import org.spring.rpg_toolset.dto.models.UserCreateRequestModel;
import org.spring.rpg_toolset.dto.models.UserCreateResponseModel;

public interface UserRegisterBoundary {
    UserCreateResponseModel create(UserCreateRequestModel requestModel);
}
