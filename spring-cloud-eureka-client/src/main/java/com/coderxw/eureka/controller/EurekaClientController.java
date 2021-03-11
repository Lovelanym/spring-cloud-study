package com.coderxw.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwei
 * @email 441504696@qq.com
 * @date 2021-03-09 18:14
 * 提供者
 */
@RestController
public class EurekaClientController {

    @GetMapping("/name")
    public String getInfo(@RequestParam String name){
        return "hello feign name:"+name;
    }


}
