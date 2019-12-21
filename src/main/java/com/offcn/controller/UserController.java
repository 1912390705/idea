package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    public String findAll(Model model){

        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return "userList";
    }
    @RequestMapping("findOne")
    public String findOne(Model model,Integer id){
        User user = userService.findOne(id);
        model.addAttribute("user",user);
        return "userUpdate";

    }
    @RequestMapping("save")
    public String save(User user){
        userService.save(user);
        return "redirect:findAll";
    }

    @RequestMapping("update")
    public String update(User user){
        userService.update(user);
        return "redirect:findAll";
    }

    @RequestMapping("delete")
    public String delete(Integer id){
        userService.deleteById(id);
        return "redirect:findAll";
    }
    @RequestMapping("page")
    public String page(String page){
        return page;
    }
}
