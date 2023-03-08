package com.chatchatabc.chatabc.user.impl.application.dubbo;

import com.chatchatabc.chatabc.UserDTO;
import com.chatchatabc.chatabc.UserServiceFacade;
import com.chatchatabc.chatabc.user.domain.repository.UserRepository;
import com.chatchatabc.chatabc.user.util.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceFacadeImpl implements UserServiceFacade {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO findUserById(Long id) {
        return UserMapper.INSTANCE.userToDto(userRepository.findUserById(id));
    }
}
