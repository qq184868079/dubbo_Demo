package cn.qingfeng.service.impl;

import cn.qingfeng.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @PackageName: cn.qingfeng.service.impl
 * @ClassName: HelloServiceImpl
 * @Author: QingFeng
 * @Date: 2019-11-25 18:09
 * @Description: //TODO
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String show(String name) {
        return "hello"+name;
    }
}
