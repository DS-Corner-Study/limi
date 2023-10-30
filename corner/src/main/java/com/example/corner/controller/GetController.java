package com.example.corner.controller;

import com.example.corner.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    // http://localhost:8080/api/v1/get-api/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello World";
    }

    //http://localhost:8080/api/v1/get-api/name
    @GetMapping(value = "/name")
    public String getName(){
        return "Flature";
    }

    //http://localhost:8080/api/v1/get-api/variable1/{String 값}
    @GetMapping(value = "variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    //http://localhost:8080/api/v1/get-api/variable2/{String 값}
    @GetMapping(value = "variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    //http://localhost:8080/api/v1/get-api/request1?name=value1&email=value2&organization=value3
    @GetMapping(value = "variable2/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    //http://localhost:8080/api/v1/get-api/request3?name=value1&email=value2&organization=value3
    @GetMapping(value="/request3")
    public String getRequestParam3(MemberDto memberDto){
        //return memberDto.getName() + " " + memberDto.getEmail() + " " + memberDto.getOrganization();
        return memberDto.toString();
    }


}
