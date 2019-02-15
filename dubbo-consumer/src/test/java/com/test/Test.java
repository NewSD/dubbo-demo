package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by ami on 2019/2/15.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:springmvc.xml"});

        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");

        String hello = demoService.sayHello("哈哈哈");
        System.out.println(hello);
        //为何Exception in thread "main" com.alibaba.dubbo.rpc.RpcException:
        // Failed to invoke the method getUsers in the service com.test.DemoService.
        // Serialized class com.test.User must implement java.io.Serializable
        List list = demoService.getUsers();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }


        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
