package com.chatchatabc.chatabc.user.impl.application.dubbo;

import com.chatchatabc.chatabc.SpringBootBaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;


public class UserServiceFacadeImplTest extends SpringBootBaseTest {
    @Autowired
    private UserServiceFacadeImpl userServiceFacade;

    @Test
    public void testFindUserById() {
        assertThat(userServiceFacade.findUserById(1L)).isNotNull();
    }
}
