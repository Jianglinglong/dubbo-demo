package jiang.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import jiang.demo.service.UserService;
import jiang.demo.service.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Reference
    private UserService userService;
    @GetMapping("/info")
    public User info(@RequestParam("id") int id){
        return userService.findById(id);
    }
}
