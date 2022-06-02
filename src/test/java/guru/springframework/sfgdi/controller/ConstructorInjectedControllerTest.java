package guru.springframework.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.service.ConstructorInjectedGreetingService;

class ConstructorInjectedControllerTest {
    
    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }

    @Test
    void testGetGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}