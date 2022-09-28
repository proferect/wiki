package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.User;
import com.jiawa.wiki.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> queryUserList(){
        return userMapper.queryUserList();
    }
}
