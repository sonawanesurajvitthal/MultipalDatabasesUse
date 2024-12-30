package com.multiple.db.service;

import com.multiple.db.domain.request.UserRequestDto;
import com.multiple.db.domain.response.UserResponseDto;
import com.multiple.db.exception.UserNotFoundException;
import com.multiple.db.mapper.UserMapper;
import com.multiple.db.mysql.entity.User;
import com.multiple.db.mysql.repo.UserRepositoryMysql;
import com.multiple.db.response.AppResponse;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    private final UserRepositoryMysql userService;

    private UserMapper userMapper;

    public UserServiceImpl(UserRepositoryMysql userService){
        this.userService = userService;
    }

    @Override
    public User saveUser(User user) {
        return userService.save(user);
    }

    @Override
    public AppResponse<UserResponseDto> createUser(UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public AppResponse<UserResponseDto> getUserById(int userId) {
        User user = userService.findById(userId).orElseThrow(()-> new UserNotFoundException("User not Found against id: "+userId));
        UserResponseDto userResponseDto = userMapper.getResponse(user);
        return new AppResponse<>("User Fetched Successfully", 200,userResponseDto);
    }

    @Override
    public AppResponse<UserResponseDto> updateUser(int userId, UserRequestDto userRequestDto) {
        return null;
    }

    @Override
    public AppResponse<List<UserResponseDto>> listOfUsers() {
        return null;
    }

    @Override
    public AppResponse<String> deleteUserById(int userId) {
        return null;
    }
}
