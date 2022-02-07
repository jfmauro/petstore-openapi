package be.petstoreapifirst.pet.exception;

public class PetNotFoundException extends RuntimeException {
    public PetNotFoundException(Long id) {
    }
}
