package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.GreetingService;

@Controller
public class MyController {
    
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
