package com.miku.service;

import com.github.pagehelper.PageInfo;
import com.miku.entity.UserInfo;
import com.miku.utils.JsonResult;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/8 19:19
 * @description:
 */
public interface IUserService {

    ArrayList<UserInfo> queryAllUser();

    JsonResult<PageInfo<UserInfo>> queryPageUsers(Integer offset,Integer limite);

    JsonResult insertUser(UserInfo userInfo);

    JsonResult deleteUser(int userId);

    JsonResult updateUser(UserInfo userInfo);
}
