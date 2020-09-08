package com.miku.controller;

import com.miku.entity.UserInfo;
import com.miku.service.IUserService;
import com.miku.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
