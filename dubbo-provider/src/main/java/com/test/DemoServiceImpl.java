package com.test;


import org.springframework.stereotype.Service;

/**
 * Created by ami on 2019/2/15.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return name;
    }
}
