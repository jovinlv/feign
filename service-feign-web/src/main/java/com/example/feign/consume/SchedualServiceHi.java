package com.example.feign.consume;

import com.example.feign.consume.hystrix.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Created by jovin .
 * @date Created on 11:17 2019/3/25.
 */
@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
  @RequestMapping(value = "/hi",method = RequestMethod.GET)
  String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
