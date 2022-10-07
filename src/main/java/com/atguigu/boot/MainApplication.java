package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author long
 * @create 2022 10 07 14:33
 */
/*主程序类
*@SpringBootApplication：这是一个SpringBoot应用
*
* */
@SpringBootApplication(scanBasePackages="com.atguigu")
public class MainApplication {

    public static void main(String[] args) {
        //应用跑起来（主类，args）
        //1.返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for(String name :names){
            System.out.println(name);
        }
    }
}
