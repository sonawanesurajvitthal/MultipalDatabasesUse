package com.multiple.db.mapper;

import com.multiple.db.domain.request.UserRequestDto;
import com.multiple.db.domain.response.UserResponseDto;
import com.multiple.db.mysql.entity.User;

public class UserMapper {

    public User getUser(UserRequestDto userRequestDto){
        User user = new User();

        user.setId(userRequestDto.getId());
        user.setEmail(userRequestDto.getEmail());
        user.setName(userRequestDto.getName());

        return user;
    }

    public UserResponseDto getResponse(User user){
        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setId(user.getId());
        userResponseDto.setName(user.getName());

        return userResponseDto;
    }
}
