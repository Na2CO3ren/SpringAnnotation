package com.robin.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class TestObject {
    public TestObject() {
        System.out.println("TestObject Construct...");
    }
}
