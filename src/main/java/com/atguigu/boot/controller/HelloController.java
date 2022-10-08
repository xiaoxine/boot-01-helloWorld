package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author long
 * @create 2022 10 07 14:41
 * @deprecated 编写业务
 */
//@ResponseBody：返回的数据是直接传到浏览器而不是跳到某个页面
//@ResponseBody
//@Controller：注解控制器来处理请求
//@Controller

//@RestController:是@ResponseBody和@Controller的合体
@RestController
public class HelloController {
    //spring的自动注入
    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    //handle01()方法来处理/hello请求
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, springBoot2!"+"你好！";
    }


}
