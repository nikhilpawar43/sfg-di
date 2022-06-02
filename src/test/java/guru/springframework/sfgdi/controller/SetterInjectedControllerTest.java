package guru.springframework.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.service.ConstructorInjectedGreetingService;

class SetterInjectedControllerTest {
    
    private SetterInjectedController setterInjectedController;
    
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void testGetGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}