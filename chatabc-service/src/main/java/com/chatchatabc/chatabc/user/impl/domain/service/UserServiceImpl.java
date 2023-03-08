package com.chatchatabc.chatabc.user.impl.domain.service;

import com.chatchatabc.chatabc.user.domain.model.User;
import com.chatchatabc.chatabc.user.domain.repository.UserRepository;
import com.chatchatabc.chatabc.user.domain.service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Long createUser(@NotNull User user) {
        return userRepository.create(user);
    }

    @Override
    public void updateUser(@NotNull User user) {
        userRepository.update(user);
    }
}
