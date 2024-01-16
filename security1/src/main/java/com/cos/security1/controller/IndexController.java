package com.cos.security1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class IndexController {

    @GetMapping({"","/"})
    public String Index() {

        return "index";
    }

    @GetMapping("/admin")
    public @ResponseBody String admin(){
        return "admin";
    }

    @GetMapping("/manager")
    public @ResponseBody String manager() {
        return "manager";
    }

    @GetMapping("/login")
    public @ResponseBody String login() {
        return "login";
    }

    @GetMapping("/join")
    public @ResponseBody String join() {
        return "join";
    }

    @GetMapping("/joinProc")
    public @ResponseBody String joinProc() {
        return "회원가입 완료됨!!";
    }
}
