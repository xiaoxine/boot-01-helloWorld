package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@Author: long
 *@CreateTime: 2022-10-07  22:19
 *@Description: 配置类
 *@Version: 1.0
 *
 * 1、配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods：代理bean的方法
 *      Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 *      组件依赖必须使用Full模式默认。其他默认是否Lite模式
 *
 *
 *
 */

@Configuration() //(proxyBeanMethods = true)告诉SpringBoot这是一个配置类 == 配置文件
public class MyConfig {
    @Bean //给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public User user01(){
        User zhangSan = new User("张三", 18);
        //user组件依赖了Pet组件
        zhangSan.setPet(tomcatPet());
        return zhangSan;
    }
    @Bean("tom")
    public Pet tomcatPet(){

        return new Pet("汤姆猫");
    }


}
