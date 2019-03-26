package com.example.feign.consume.hystrix;

import com.example.feign.consume.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author Created by jovin .
 * @date Created on 12:27 2019/3/25.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

  @Override
  public String sayHiFromClientOne(String name) {
    return "sorry"+ name;
  }
}
