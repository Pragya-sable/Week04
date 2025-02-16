package com.annotation.practiceproblems.advance.cacheresult;


import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    // Method to invoke the cached method and cache the result
    public static Object invokeCachedMethod(Object obj, String methodName, Object... args) throws Exception {
        // Get the method from the class
        Method method = obj.getClass().getMethod(methodName, getParameterTypes(args));

        // Check if the method is annotated with @CacheResult
        if (method.isAnnotationPresent(CacheResult.class)) {
            // Create a unique key for the cache using method name and arguments
            String key = methodName + "_" + getArgsKey(args);

            // If the result is already cached, return it
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for: " + key);
                return cache.get(key);
            }

            // Otherwise, compute the result and cache it
            Object result = method.invoke(obj, args);
            cache.put(key, result);
            return result;
        } else {
            return method.invoke(obj, args);  // If no cache annotation, just invoke the method normally
        }
    }

    // Helper method to generate a cache key from method arguments
    private static String getArgsKey(Object... args) {
        StringBuilder key = new StringBuilder();
        for (Object arg : args) {
            key.append(arg != null ? arg.toString() : "null").append("_");
        }
        return key.toString();
    }

    // Helper method to get the parameter types of the method based on the arguments
    private static Class<?>[] getParameterTypes(Object... args) {
        Class<?>[] paramTypes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            paramTypes[i] = args[i].getClass();
        }
        return paramTypes;
    }
}
