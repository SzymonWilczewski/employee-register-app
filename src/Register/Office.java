package Register;

import java.util.*;

public class Office extends Employee {
    private final String officeId;
    private int intellect;

    public Office(String name, String surname, int age, int experience, Address address, int intellect) {
        super(name, surname, age, experience, address);
        this.officeId = UUID.randomUUID().toString();
        setIntellect(intellect);
    }

    public String getOfficeId() { return officeId; }

    public int getIntellect() { return intellect; }

    public void setIntellect(int intellect) {
        if (intellect < 70 || intellect > 150) {
            throw new IllegalArgumentException("Intellect must be between 70-150!");
        } else {
            this.intellect = intellect;
        }
    }

    public int getValue() {
        return this.getExperience() * this.getIntellect();
    }
}
