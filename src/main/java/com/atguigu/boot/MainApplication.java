package com.atguigu.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author long
 * @create 2022 10 07 14:33
 */
/*主程序类
*@SpringBootApplication：这是一个SpringBoot应用
*
* */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        //应用跑起来（主类，args）
        SpringApplication.run(MainApplication.class,args);

    }
}
