package jiang.demo.controller;

import jiang.demo.service.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Qualifier("dubboService")
    DubboService dubboService;

    @GetMapping("/hello.json")
    public String hello(){
        return "hello"+dubboService.dubbo();
    }
}
