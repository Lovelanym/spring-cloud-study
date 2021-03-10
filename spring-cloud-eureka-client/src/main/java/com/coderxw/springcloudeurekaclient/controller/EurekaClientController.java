package com.coderxw.springcloudeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwei
 * @email 441504696@qq.com
 * @date 2021-03-09 18:14
 */
@RestController
@RequestMapping("/eureka")
public class EurekaClientController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/prot")
    public String getInfo(){
        return "hello eureka prot:"+port;
    }


}
