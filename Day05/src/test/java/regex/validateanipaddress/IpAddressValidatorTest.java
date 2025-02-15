package regex.validateanipaddress;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IpAddressValidatorTest {

    @Test
    public void testValidIPAddresses() {
        // Test with valid IPv4 addresses
        assertTrue(IpAddressValidator.isValidIP("192.168.1.1"));
        assertTrue(IpAddressValidator.isValidIP("255.255.255.255"));
        assertTrue(IpAddressValidator.isValidIP("0.0.0.0"));
        assertTrue(IpAddressValidator.isValidIP("127.0.0.1"));
        assertTrue(IpAddressValidator.isValidIP("10.0.0.1"));
        assertTrue(IpAddressValidator.isValidIP("172.16.254.1"));
    }

    @Test
    public void testInvalidIPAddresses() {
        // Test with invalid IPv4 addresses
        assertFalse(IpAddressValidator.isValidIP("256.256.256.256"));  // Values above 255
        assertFalse(IpAddressValidator.isValidIP("192.168.1.999"));    // Last octet out of range
        assertFalse(IpAddressValidator.isValidIP("192.168.1"));        // Too few octets
        assertFalse(IpAddressValidator.isValidIP("192.168.1.1.1"));    // Too many octets

    }
}
