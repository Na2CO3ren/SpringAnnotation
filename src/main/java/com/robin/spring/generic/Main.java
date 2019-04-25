package com.robin.spring.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("beans-generic.xml");

        UserService userService = (UserService)cnt.getBean("userService");
        userService.add();
    }
}
