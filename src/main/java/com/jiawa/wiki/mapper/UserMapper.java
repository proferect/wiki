package com.jiawa.wiki.mapper;

import com.jiawa.wiki.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    public List<User>  queryUserList();
}
