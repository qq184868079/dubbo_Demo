package cn.qingfeng.controller;

import cn.qingfeng.service.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @PackageName: cn.qingfeng.controller
 * @ClassName: DubboTest
 * @Author: QingFeng
 * @Date: 2019-11-25 18:25
 * @Description: //TODO
 */
@Controller
@RequestMapping("/demo")
public class DubboTest {
    @Reference
    private HelloService helloService;

    @RequestMapping("/show")
    @ResponseBody
    public String test(String name) {
        return helloService.show(name);
    }

}
