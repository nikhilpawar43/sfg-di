package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello World - from Primary Bean !";
    }
}
