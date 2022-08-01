package guru.springframework.sfgdi.service;

public class I18NSpanishGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
