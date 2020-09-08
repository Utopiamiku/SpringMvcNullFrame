package com.miku.service;

import com.miku.entity.UserInfo;

import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/8 19:19
 * @description:
 */
public interface IUserService {

    ArrayList<UserInfo> queryAllUser();
}
