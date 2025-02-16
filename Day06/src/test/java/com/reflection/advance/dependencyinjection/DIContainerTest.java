package com.reflection.advance.dependencyinjection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class DIContainerTest {
    @Test
    void testDependencyInjection() throws Exception {
        DIContainer container = new DIContainer();
        container.register(ServiceImpl.class);

        Client client = new Client();
        container.injectDependencies(client);

        assertNotNull(client.service);
    }
}