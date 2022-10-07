package com.atguigu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author: long
 *@CreateTime: 2022-10-07  21:34
 *@Description: TODO
 *@Version: 1.0
 */

@RestController
public class WordController {
    @RequestMapping("/www")
    public String word1(){
        return "wordTest";
    }
}
