package com.reflection.advance.loggingproxy;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class LoggingProxyTest {

    @Test
    void testLoggingProxy() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Greeting greeting = new GreetingImpl();
        Greeting proxy = LoggingProxy.createProxy(greeting, Greeting.class);

        String result = proxy.sayHello("Pragya");


        System.setOut(System.out);

        assertEquals("Hello, Pragya!", result);
        assertTrue(outputStream.toString().contains("Executing method: sayHello"));
    }
}