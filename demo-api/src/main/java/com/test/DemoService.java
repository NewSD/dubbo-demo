package com.test;

import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.util.List;

/**
 * Created by ami on 2019/2/15.
 */
public interface DemoService {

    String sayHello(String name);

    List getUsers();

}
