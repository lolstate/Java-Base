package com.lolstate.auth.controller;

import com.lolstate.auth.dto.response.ServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController extends BaseController {
    @GetMapping("")
    public static void getUser(String[] args) {
        System.out.println("Hello User");
    }

    @GetMapping("/hello")
    public ServiceResponse hello() {
        return ServiceResponse.builder()
                .success(true)
                .data("Hello World")
                .build();
    }
}
