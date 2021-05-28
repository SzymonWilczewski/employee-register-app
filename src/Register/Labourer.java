package Register;

public class Labourer extends Employee {
    private int strength;

    public Labourer(String name, String surname, int age, int experience, Address address, int strength) {
        super(name, surname, age, experience, address);
        setStrength(strength);
    }

    public int getStrength() { return strength; }

    public void setStrength(int strength) {
        if (strength < 1 || strength > 100) {
            throw new IllegalArgumentException("Strength must be between 1-100!");
        } else {
            this.strength = strength;
        }
    }

    public int getValue() {
        return this.getExperience() * this.getStrength() / this.getAge();
    }
}
