package be.petstoreapifirst.pet.model;

public enum PetStatus {
    AVAILABLE("available"),
    PENDING("pending"),
    SOLD("sold");

    private String value;

    PetStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * From value pet status.
     *
     * @param value the value
     * @return the pet status
     */
    public static PetStatus fromValue(String value) {
        for (PetStatus enumValue : PetStatus.values()) {
            if (enumValue.toString().equals(value))
                return enumValue;
        }
        return null;
    }
}
