package com.miku.controller;

import com.github.pagehelper.PageInfo;
import com.miku.entity.UserInfo;
import com.miku.service.IUserService;
import com.miku.utils.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * @author: Utopiamiku
 * @date: 2020/9/8 19:26
 * @description:
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;


    @RequestMapping("demo")
    @ResponseBody
    public JsonResult demo() {
        JsonResult<ArrayList<UserInfo>> users = new JsonResult<>();
        users.setObj(userService.queryAllUser());
        return users;
    }

    @RequestMapping("query")
    @ResponseBody
    public JsonResult<PageInfo<UserInfo>> queryAllUsers(@RequestParam(value = "pageNumber") Integer offset,@RequestParam(value = "pageSize") Integer limit) {

        return userService.queryPageUsers(offset, limit);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public JsonResult<PageInfo<UserInfo>> insertUser(UserInfo userInfo, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        System.out.println(userName);

        JsonResult jsonResult = userService.insertUser(userInfo);
        return jsonResult;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public JsonResult<PageInfo<UserInfo>> deleteUser(Integer userId) {

        JsonResult jsonResult = userService.deleteUser(userId);
        return jsonResult;
    }

    @RequestMapping("update")
    @ResponseBody
    public JsonResult<PageInfo<UserInfo>> updateUser(UserInfo userInfo) {

        JsonResult jsonResult = userService.updateUser(userInfo);
        return jsonResult;
    }

}
