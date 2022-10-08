package com.atguigu.boot;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author long
 * @create 2022 10 07 14:33
 */
/*主程序类;主配置类
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
        //3.从容器中获取组件

/*        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);//只注册一个，获取多个都是一样的
        System.out.println("组件："+(tom01 == tom02));

        //com.atguigu.boot.config.MyConfig$$EnhancerBySpringCGLIB$$96ffdc86@63a5d002
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user == user1);

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println("用户的宠物："+(user01.getPet() == tom));

        //5获取组件

        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("=======");
        for(String s : beanNamesForType){
            System.out.println(s);

        }

        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);
        //com.atguigu.boot.bean.User
        //user01
        //ch.qos.logback.core.db.DBHelper@771158fb*/
//        boolean tom = run.containsBean("tom");
//        System.out.println("容器中Tom组件："+tom);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中Tom22组件："+tom22);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中User01组件："+user01);

    }
}
