package com.chatchatabc.chatabc.user.domain.service;


import com.chatchatabc.chatabc.user.domain.model.User;
import org.jetbrains.annotations.NotNull;

public interface UserService {

    Long createUser(@NotNull User user);

    void updateUser(@NotNull User user);
}
