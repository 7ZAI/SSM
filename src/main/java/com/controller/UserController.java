package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author:binblink
 * @Description
 * @Date: Create on  2019/8/10 10:40
 * @Modified By:
 * @Version:1.0.0
 **/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public String getAllUser(Model model) throws Exception {

        List<User> users = userService.getAllUser();

        model.addAttribute("user",users);
        model.addAttribute("msg","吃屎");
        return "user";
    }

}
