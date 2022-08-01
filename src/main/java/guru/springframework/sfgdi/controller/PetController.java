package guru.springframework.sfgdi.controller;

import org.springframework.stereotype.Controller;

import guru.springframework.pets.PetService;

@Controller
public class PetController {
    
    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
