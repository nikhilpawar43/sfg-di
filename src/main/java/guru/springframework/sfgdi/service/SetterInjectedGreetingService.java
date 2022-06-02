package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello World - setter";
    }
}
