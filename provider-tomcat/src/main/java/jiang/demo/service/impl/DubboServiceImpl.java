package jiang.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import jiang.demo.service.DubboService;

@Service(timeout = 5000)
@org.springframework.stereotype.Service("dubboService")
public class DubboServiceImpl implements DubboService {
    @Override
    public String dubbo() {
        return "hello dubbo !";
    }
}
