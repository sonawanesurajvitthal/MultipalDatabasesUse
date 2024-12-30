package com.multiple.db.service;

import com.multiple.db.domain.request.UserRequestDto;
import com.multiple.db.domain.response.UserResponseDto;
import com.multiple.db.mysql.entity.User;
import com.multiple.db.response.AppResponse;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    AppResponse<UserResponseDto> createUser(UserRequestDto userRequestDto);

    AppResponse<UserResponseDto> getUserById(int userId);

    AppResponse<UserResponseDto> updateUser(int userId, UserRequestDto userRequestDto);

    AppResponse<List<UserResponseDto>> listOfUsers();

    AppResponse<String> deleteUserById(int userId);
}
