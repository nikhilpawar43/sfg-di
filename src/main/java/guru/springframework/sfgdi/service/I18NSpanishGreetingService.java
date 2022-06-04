package guru.springframework.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18NGreetingService")
public class I18NSpanishGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
