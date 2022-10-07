package com.atguigu.boot.bean;

/**
 *@Author: long
 *@CreateTime: 2022-10-07  22:15
 *@Description: 宠物
 *@Version: 1.0
 */
public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet() {

    }
}
