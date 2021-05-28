package Register;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OfficeTest {

    @Test
    public void testGetOfficeId() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals(36, JohnBecker.getOfficeId().length());
    }

    @Test
    public void testGetIntellect() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals(132, JohnBecker.getIntellect());
    }

    @Test
    public void testSetIntellect() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        JohnBecker.setIntellect(135);
        assertEquals(135, JohnBecker.getIntellect());
    }

    @Test
    public void testGetValue() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals(10560, JohnBecker.getValue());
    }

}
