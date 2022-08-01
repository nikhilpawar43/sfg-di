package guru.springframework.sfgdi.service;

public class I18NEnglishGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}
