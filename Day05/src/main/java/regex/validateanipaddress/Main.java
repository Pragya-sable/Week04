package com.validateanipaddress;

public class Main {

    public static void main(String[] args) {
        // Test cases
        System.out.println(IpAddressValidator.isValidIP("192.168.1.1"));
        System.out.println(IpAddressValidator.isValidIP("255.255.255.255"));
        System.out.println(IpAddressValidator.isValidIP("256.256.256.256"));
        System.out.println(IpAddressValidator.isValidIP("192.168.1"));
        System.out.println(IpAddressValidator.isValidIP("123.045.067.089"));
    }
}
