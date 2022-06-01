package guru.springframework.sfgdi.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.service.GreetingServiceImpl;

class ConstructorInjectedControllerTest {
    
    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void testGetGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}