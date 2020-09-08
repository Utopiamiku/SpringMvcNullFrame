package com.miku.service.impl;

import com.miku.dao.UserInfoMapper;
import com.miku.entity.UserInfo;
import com.miku.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/8 19:20
 * @description:
 */
@Component
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public ArrayList<UserInfo> queryAllUser() {
        ArrayList<UserInfo> userInfos = userInfoMapper.queryAllUser();


        return userInfos;
    }
}
