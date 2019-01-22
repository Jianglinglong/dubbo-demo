package jiang.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import jiang.demo.service.DubboService;
import org.springframework.stereotype.Component;

@Service
@Component
public class DubboServiceImpl implements DubboService {
    @Override
    public String dubbo() {
        return "hello dubbo from container";
    }
}
