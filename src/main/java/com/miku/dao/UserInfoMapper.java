package com.miku.dao;

import com.miku.entity.UserInfo;

import java.util.ArrayList;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    ArrayList<UserInfo> queryAllUser();
}