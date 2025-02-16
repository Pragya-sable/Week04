package com.annotation.practiceproblems.intermediate.logexecutiontime;


import java.lang.reflect.Proxy;

public class LogExecutionProcessor {
    public static void main(String[] args) {
        Service service = new Service();

        // Create a proxy for the service object
        IService proxyInstance = (IService) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{IService.class},  // Interface implemented by Service
                new ExecutionTimeHandler(service)  // Invocation handler
        );

        // Use the proxy instance to invoke methods
        proxyInstance.processData();  // This will log execution time
        proxyInstance.fetchData();    // This will log execution time
        proxyInstance.helperMethod(); // This will not log execution time
    }
}
