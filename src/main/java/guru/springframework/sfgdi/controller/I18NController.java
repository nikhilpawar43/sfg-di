package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.service.GreetingService;

@Controller
public class I18NController {

    private GreetingService greetingService;

    public I18NController(@Qualifier("i18NGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
