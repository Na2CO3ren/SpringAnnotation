package com.robin.spring.annotation;

import com.robin.spring.controller.UserController;
import com.robin.spring.repository.UserRepository;
import com.robin.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("beans-annotation.xml");

        TestObject testObject = (TestObject)cnt.getBean("testObject");
        System.out.println(testObject);

        UserController userController = (UserController)cnt  .getBean("userController");
        System.out.println(userController);

        UserRepository userRepository = (UserRepository)cnt.getBean("userRepository");
        System.out.println(userRepository);

        UserService userService = (UserService)cnt.getBean("userService");
        System.out.println(userService);
    }
}
