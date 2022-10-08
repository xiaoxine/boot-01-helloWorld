package com.atguigu.boot.bean;

import lombok.*;

/**
 *@Author: long
 *@CreateTime: 2022-10-07  22:17
 *@Description: 用户
 *@Version: 1.0
 */
//@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {

    private String name;

    private Integer age;

    private Pet pet;


    public User(String name, Integer age) {

        this.name = name;
        this.age = age;
    }
}
