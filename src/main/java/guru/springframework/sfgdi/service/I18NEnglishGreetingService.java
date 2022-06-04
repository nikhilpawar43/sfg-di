package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18NGreetingService")
public class I18NEnglishGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hello world - EN";
    }
}
