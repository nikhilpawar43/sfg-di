package guru.springframework.sfgdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.sfgdi.service.I18NEnglishGreetingService;
import guru.springframework.sfgdi.service.I18NSpanishGreetingService;
import guru.springframework.sfgdi.service.PrimaryGreetingService;

@Configuration
public class GreetingServiceConfig {

    @Bean
    @Primary
    public PrimaryGreetingService greetingService() {
        return new PrimaryGreetingService();
    }
    
    @Bean
    @Profile("EN")
    public I18NEnglishGreetingService i18NGreetingService() {
        return new I18NEnglishGreetingService();
    }
    
    @Bean("i18NGreetingService")
    @Profile({"ES", "default"})
    public I18NSpanishGreetingService i18NSpanishGreetingService() {
        return new I18NSpanishGreetingService();    
    }
}
