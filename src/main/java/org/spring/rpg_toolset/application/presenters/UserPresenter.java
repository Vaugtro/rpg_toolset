package org.spring.rpg_toolset.application.presenters;

import org.spring.rpg_toolset.dto.models.UserCreateResponseModel;

public interface UserPresenter {
    UserCreateResponseModel prepareSuccessView(UserCreateResponseModel user);

    UserCreateResponseModel prepareErrorView(String error);
}
