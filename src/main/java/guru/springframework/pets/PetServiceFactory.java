package guru.springframework.pets;

public class PetServiceFactory {
    
    public PetService getPetService(String petType) {
        switch (petType) {
            case "DOG":
                return new DogPetService();
                
            case "CAT":
                return new CatPetService();
                
            default:
                return new DogPetService();
        }
    }
}
