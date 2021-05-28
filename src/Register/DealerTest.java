package Register;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DealerTest {

    @Test
    public void testGetEfficiency() {
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);
        assertEquals(Dealer.Efficiency.HIGH, PaulAdams.getEfficiency());
    }

    @Test
    public void testGetCommission() {
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);
        assertEquals(15, PaulAdams.getCommission());
    }

    @Test
    public void testSetEfficiency() {
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);
        PaulAdams.setEfficiency(Dealer.Efficiency.MEDIUM);
        assertEquals(Dealer.Efficiency.MEDIUM, PaulAdams.getEfficiency());
    }

    @Test
    public void testSetCommission() {
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);
        PaulAdams.setCommission(20);
        assertEquals(20, PaulAdams.getCommission());
    }

    @Test
    public void testGetValue() {
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);
        assertEquals(10800, PaulAdams.getValue());
    }

    @Test
    public void testEfficiencyGetValue() {
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.LOW, 15);
        assertEquals(60, PaulAdams.getEfficiency().getValue());
    }

}
