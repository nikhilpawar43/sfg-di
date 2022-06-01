package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;

public class PropertyInjectedController {
    
    public GreetingService greetingService;
    
    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
