package com.nagornov.multimicroserviceproject.authservice.mapper;

import com.nagornov.multimicroserviceproject.authservice.dto.auth.LoginFormRequest;
import com.nagornov.multimicroserviceproject.authservice.dto.auth.OAuthUserInfoResponse;
import com.nagornov.multimicroserviceproject.authservice.dto.registration.RegFormRequest;
import com.nagornov.multimicroserviceproject.authservice.dto.user.UserResponse;
import com.nagornov.multimicroserviceproject.authservice.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toUserResponse(User user);

    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "verificationCode", ignore = true)
    @Mapping(target = "roles", ignore = true)
    User toUser(RegFormRequest req);

    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "firstName", ignore = true)
    @Mapping(target = "lastName", ignore = true)
    @Mapping(target = "verificationCode", ignore = true)
    @Mapping(target = "roles", ignore = true)
    User toUser(LoginFormRequest req);

    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "password", ignore = true)
    @Mapping(target = "verificationCode", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "username", source = "id")
    User toUser(OAuthUserInfoResponse res);
}
