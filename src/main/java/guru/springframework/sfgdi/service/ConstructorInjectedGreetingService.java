package guru.springframework.sfgdi.service;

public class ConstructorInjectedGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello World - constructor";
    }
}
