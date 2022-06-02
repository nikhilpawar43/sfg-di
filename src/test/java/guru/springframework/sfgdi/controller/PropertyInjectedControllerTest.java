package guru.springframework.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.service.ConstructorInjectedGreetingService;

class PropertyInjectedControllerTest {
    
    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorInjectedGreetingService();
    }

    @Test
    void testGetGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}