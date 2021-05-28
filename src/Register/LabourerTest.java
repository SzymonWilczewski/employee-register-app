package Register;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabourerTest {

    @Test
    public void testGetStrength() {
        Labourer RandallCampbell = new Labourer("Randall", "Campbell", 28, 40, new Address("Ella", 3797, 0, "Millbrae"), 92);
        assertEquals(92, RandallCampbell.getStrength());
    }

    @Test
    public void testSetStrength() {
        Labourer RandallCampbell = new Labourer("Randall", "Campbell", 28, 40, new Address("Ella", 3797, 0, "Millbrae"), 92);
        RandallCampbell.setStrength(90);
        assertEquals(90, RandallCampbell.getStrength());
    }

    @Test
    public void testGetValue() {
        Labourer RandallCampbell = new Labourer("Randall", "Campbell", 28, 40, new Address("Ella", 3797, 0, "Millbrae"), 92);
        assertEquals(131, RandallCampbell.getValue());
    }

}
