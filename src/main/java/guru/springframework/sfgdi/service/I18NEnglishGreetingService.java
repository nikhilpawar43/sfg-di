package guru.springframework.sfgdi.service;

import guru.springframework.sfgdi.repository.EnglishGreetingRepository;

public class I18NEnglishGreetingService implements GreetingService {
    
    private EnglishGreetingRepository englishGreetingRepository;

    public I18NEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
