package com.annotation.practiceproblems.advance.cacheresult;

public class CacheDemo {
    public static void main(String[] args) throws Exception {
        ExpensiveComputation computation = new ExpensiveComputation();

        System.out.println("Result: " + CacheManager.invokeCachedMethod(computation, "computeFactorial", 5));
        System.out.println("Result: " + CacheManager.invokeCachedMethod(computation, "computeFactorial", 5)); // Cached result
        System.out.println("Result: " + CacheManager.invokeCachedMethod(computation, "computeFactorial", 6));
    }
}
