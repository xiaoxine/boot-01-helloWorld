package com.atguigu.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *@Author: long
 *@CreateTime: 2022-10-08  17:06
 *@Description: 车
 *@Version: 1.0
 *  如何使用Java读取到properties文件中的内容，并且把它封装到JavaBean中，
 *  以供随时使用；@ConfigurationProperties配置绑定
 * @Component 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 */
//@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String brand;
    private Integer price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

