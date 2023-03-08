package com.chatchatabc.chatabc.user.impl.domain.service;

import com.chatchatabc.chatabc.SpringBootBaseTest;
import com.chatchatabc.chatabc.user.domain.model.User;
import com.chatchatabc.chatabc.user.impl.domain.repository.UserRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceImplTest extends SpringBootBaseTest {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserRepositoryImpl userRepository;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setNick("davao008");
        final Long userId = userService.createUser(user);
        assertThat(userRepository.findUserById(userId)).isNotNull();
    }
}
