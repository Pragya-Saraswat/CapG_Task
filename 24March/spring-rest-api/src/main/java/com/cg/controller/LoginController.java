package com.cg.controller;

import com.cg.bean.UserBean;
import com.cg.repo.UserBeanRepo;
import com.cg.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(@RequestBody UserBean ub, HttpSession session) {
        UserBean u = loginService.validateUser(ub);
        if (u != null) {
            session.setAttribute("name", ub.getUserId());
            return "Login Success";
        } else {
            return "Login Failed";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        if (session.getAttribute("name") != null) {
            session.invalidate();
        }
        return "User Logged Out";
    }
}
//HTTp is stateless protocol therefore to make it stateful session is used