package com.coderxw.feign.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xuwei
 * @email 441504696@qq.com
 * @date 2021-03-11 16:08
 * feign远程调用接口类
 * @FeignClient() 注解中设置的是调用的服务注册在eureka中的名称
 */
@FeignClient("eureka-client-xw")
public interface FeignService {

    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String feiginService(@RequestParam(name = "name")String name);
}
