package com.annotation.practiceproblems.intermediate.logexecutiontime;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    @Test
    public void testProcessDataExecutionTime() {
        Service service = new Service();
        IService proxyInstance = (IService) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{IService.class},
                new ExecutionTimeHandler(service)
        );

        // Capture the output of execution
        // In a real-world scenario, use a logging framework and capture the logs.
        // Here we're just testing the process.
        proxyInstance.processData();
    }

    @Test
    public void testFetchDataExecutionTime() {
        Service service = new Service();
        IService proxyInstance = (IService) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{IService.class},
                new ExecutionTimeHandler(service)
        );

        // Test the fetchData method execution
        proxyInstance.fetchData();
    }

    @Test
    public void testHelperMethodDoesNotLog() {
        Service service = new Service();
        IService proxyInstance = (IService) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{IService.class},
                new ExecutionTimeHandler(service)
        );

        // This should not log execution time
        proxyInstance.helperMethod();
    }
}
