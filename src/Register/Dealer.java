package Register;

public class Dealer extends Employee {
    private Efficiency efficiency;
    private int commission;

    public Dealer(String name, String surname, int age, int experience, Address address, Efficiency efficiency, int commission) {
        super(name, surname, age, experience, address);
        setEfficiency(efficiency);
        setCommission(commission);
    }

    public Efficiency getEfficiency() { return efficiency; }

    public int getCommission() { return commission; }

    public void setEfficiency(Efficiency efficiency) {
        this.efficiency = efficiency;
    }

    public void setCommission(int commission) {
        if (commission < 0) {
            throw new IllegalArgumentException("Commission cannot be a negative value!");
        } else {
            this.commission = commission;
        }
    }

    public int getValue() {
        return this.getExperience() * this.getEfficiency().getValue();
    }

    enum Efficiency {
        LOW(60),
        MEDIUM(90),
        HIGH(120);

        private final int value;

        public int getValue() { return value; }

        Efficiency(int value) {
            this.value = value;
        }
    }
}
