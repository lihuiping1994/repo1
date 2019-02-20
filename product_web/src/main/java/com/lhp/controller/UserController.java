package com.lhp.controller;

import com.lhp.domain.UserInfo;
import com.lhp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView();
        List<UserInfo> userInfo = userService.findAll();
        mv.addObject("userList", userInfo);
        mv.setViewName("user-list");
        return mv;
    }

    @RequestMapping("/save.do")
    public String save(UserInfo info) {
        userService.save(info);
        return "redirect:/user/findAll.do";
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(@RequestParam(name = "id") String id) {
        ModelAndView mv=new ModelAndView();
        UserInfo userInfoList=userService.findById(id);
        mv.addObject("user",userInfoList);
        mv.setViewName("user-show");
        return mv;
    }


}
