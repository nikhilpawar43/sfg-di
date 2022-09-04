package guru.springframework.sfgdi.config;

import guru.springframework.pets.PetService;
import guru.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repository.EnglishGreetingRepository;
import guru.springframework.sfgdi.repository.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.service.I18NEnglishGreetingService;
import guru.springframework.sfgdi.service.I18NSpanishGreetingService;
import guru.springframework.sfgdi.service.PrimaryGreetingService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

@EnableConfigurationProperties(SfgContructorConfig.class)
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    @Primary
    public PrimaryGreetingService greetingService() {
        return new PrimaryGreetingService();
    }
    
    @Bean
    public EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }
    
    @Bean
    @Profile("EN")
    public I18NEnglishGreetingService i18NGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18NEnglishGreetingService(englishGreetingRepository);
    }
    
    @Bean("i18NGreetingService")
    @Profile({"ES", "default"})
    public I18NSpanishGreetingService i18NSpanishGreetingService() {
        return new I18NSpanishGreetingService();    
    }
    
    @Bean
    public PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }
    
    @Bean
    @Profile("cat")
    public PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("CAT");
    }

    @Bean
    @Profile({"dog", "default"})
    public PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("DOG");
    }
    
    @Bean
    public FakeDataSource fakeDataSource(SfgContructorConfig sfgContructorConfig) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgContructorConfig.getUsername());
        fakeDataSource.setPassword(sfgContructorConfig.getPassword());
        fakeDataSource.setJdbcUrl(sfgContructorConfig.getJdbcUrl());
        
        return fakeDataSource;
    }
}
