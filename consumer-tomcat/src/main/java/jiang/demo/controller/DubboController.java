package jiang.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import jiang.demo.service.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {
    @Reference
    private DubboService dubboService;

    @GetMapping("/dubbo")
    public String dubbo() {
        return dubboService.dubbo();
    }
}
