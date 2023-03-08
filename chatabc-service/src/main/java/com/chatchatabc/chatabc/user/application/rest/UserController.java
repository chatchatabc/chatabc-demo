package com.chatchatabc.chatabc.user.application.rest;

import com.chatchatabc.chatabc.UserDTO;
import com.chatchatabc.chatabc.user.util.UserMapper;
import com.chatchatabc.chatabc.user.domain.model.User;
import com.chatchatabc.chatabc.user.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public UserDTO show(@PathVariable Long id) {
        return toDto(userRepository.findUserById(id));
    }

    private UserDTO toDto(User user) {
        return UserMapper.INSTANCE.userToDto(user);
    }
}
