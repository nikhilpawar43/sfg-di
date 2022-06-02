package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.GreetingService;

@Controller
public class PropertyInjectedController {
    
    @Autowired
    public GreetingService greetingService;
    
    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
