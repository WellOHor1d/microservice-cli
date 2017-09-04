package com.ytfz.controller;

import com.ytfz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XY on 2017/8/30.
 */
@RestController
public class DemoController {
    @Autowired
    private IUserService userService;
    
    @GetMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("hello world");
    }
    
    @GetMapping("/user")
    public ResponseEntity getUser() {
        return ResponseEntity.ok(userService.listUsers());
    }
    
}
