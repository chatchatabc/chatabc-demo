package com.chatchatabc.chatabc.user.util;

import com.chatchatabc.chatabc.UserDTO;
import com.chatchatabc.chatabc.user.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToDto(User user);
}
