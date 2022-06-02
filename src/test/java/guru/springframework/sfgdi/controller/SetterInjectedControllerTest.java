package guru.springframework.sfgdi.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.service.GreetingServiceImpl;

class SetterInjectedControllerTest {
    
    private SetterInjectedController setterInjectedController;
    
    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void testGetGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}