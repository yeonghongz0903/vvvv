package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test

    public void TestGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        return "Hello, World!",helloWorld.getGreeting();
    }
}