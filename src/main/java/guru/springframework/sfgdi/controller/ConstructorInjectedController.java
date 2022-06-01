package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;

public class ConstructorInjectedController {
    
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
