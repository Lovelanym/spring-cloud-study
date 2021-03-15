package com.coderxw.feign.controller;

import com.coderxw.feign.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuwei
 * @email 441504696@qq.com
 * @date 2021-03-09 18:14
 * 消費者
 */
@RestController
@RequestMapping("/feign")
public class EurekaClientController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/name")
    public String getInfo(@RequestParam(name = "name")String name){
        return feignService.feiginService(name);
     }


}
