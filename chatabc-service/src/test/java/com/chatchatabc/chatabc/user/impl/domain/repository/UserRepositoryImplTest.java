package com.chatchatabc.chatabc.user.impl.domain.repository;

import com.chatchatabc.chatabc.SpringBootBaseTest;
import com.chatchatabc.chatabc.user.domain.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class UserRepositoryImplTest extends SpringBootBaseTest {
    @Autowired
    private UserRepositoryImpl userRepository;

    @Test
    public void testFindUserById() {
        final User user = userRepository.findUserById(1L);
        assertThat(user).isNotNull();
    }
}
