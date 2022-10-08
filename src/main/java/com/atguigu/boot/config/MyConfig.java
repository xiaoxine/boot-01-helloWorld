package com.atguigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
 * 4、@Import({User.class, DBHelper.class})
 *      给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 *
 *
 */
@Import({User.class, DBHelper.class}) //import的好处是可以引入外部类;给容器中导入一个组件
@Configuration() //(proxyBeanMethods = true)告诉SpringBoot这是一个配置类 == 配置文件
//@ConditionalOnBean(name = "tom")
@ConditionalOnMissingBean(name = "tom") //条件装配：满足Conditional指定的条件，则进行组件注入
public class MyConfig {
//    @ConditionalOnBean(name = "tom")
    @Bean //给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
    public User user01(){
        User zhangSan = new User("张三", 18);
        //user组件依赖了Pet组件
        zhangSan.setPet(tomcatPet());
        return zhangSan;
    }
//    @Bean("tom")
    @Bean("tom22")
    public Pet tomcatPet(){

        return new Pet("汤姆猫");
    }


}
