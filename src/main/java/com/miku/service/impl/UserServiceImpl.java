package com.miku.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.miku.dao.UserInfoMapper;
import com.miku.entity.UserInfo;
import com.miku.service.IUserService;
import com.miku.utils.JsonResult;
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

   private JsonResult jsonResult = new JsonResult();

    @Override
    public ArrayList<UserInfo> queryAllUser() {
        ArrayList<UserInfo> userInfos = userInfoMapper.queryAllUser();
        return userInfos;
    }

    @Override
    public JsonResult<PageInfo<UserInfo>> queryPageUsers(Integer offset, Integer limit) {
        PageHelper.offsetPage((offset-1)*3,limit);
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoMapper.queryAllUser());

        jsonResult.setObj(pageInfo);

        return jsonResult;
    }

    @Override
    public JsonResult insertUser(UserInfo userInfo) {
        int i = userInfoMapper.insertSelective(userInfo);

        if(i>0){
            jsonResult.setMsg("添加成功");
            jsonResult.setStateCode(200);
        }else{
            jsonResult.setMsg("添加失败");
            jsonResult.setStateCode(500);
        }
        return jsonResult;
    }

    @Override
    public JsonResult deleteUser(int userId) {
        int i = userInfoMapper.deleteByPrimaryKey(userId);

        if(i>0){
            jsonResult.setMsg("删除成功");
            jsonResult.setStateCode(200);
        }else{
            jsonResult.setMsg("删除失败");
            jsonResult.setStateCode(500);
        }
        return jsonResult;
    }

    @Override
    public JsonResult updateUser(UserInfo userInfo) {
        int i = userInfoMapper.updateByPrimaryKeySelective(userInfo);
        if(i>0){
            jsonResult.setMsg("修改成功");
            jsonResult.setStateCode(200);
        }else{
            jsonResult.setMsg("修改失败");
            jsonResult.setStateCode(500);
        }
        return jsonResult;
    }
}
