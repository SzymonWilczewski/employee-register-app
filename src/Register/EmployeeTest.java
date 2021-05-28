package Register;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testGetId() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals(36, JohnBecker.getId().length());
    }

    @Test
    public void testGetName() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals("John", JohnBecker.getName());
    }

    @Test
    public void testGetSurname() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals("Becker", JohnBecker.getSurname());
    }

    @Test
    public void testGetAge() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals(43, JohnBecker.getAge());
    }

    @Test
    public void testGetExperience() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals(80, JohnBecker.getExperience());
    }

    @Test
    public void testGetAddress() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        assertEquals("Minneapolis", JohnBecker.getAddress().getCity());
    }

    @Test
    public void testSetName() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        JohnBecker.setName("Jerry");
        assertEquals("Jerry", JohnBecker.getName());
    }

    @Test
    public void testSetSurname() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        JohnBecker.setSurname("Martin");
        assertEquals("Martin", JohnBecker.getSurname());
    }

    @Test
    public void testSetAge() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        JohnBecker.setAge(44);
        assertEquals(44, JohnBecker.getAge());
    }

    @Test
    public void testSetExperience() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        JohnBecker.setExperience(90);
        assertEquals(90, JohnBecker.getExperience());
    }

    @Test
    public void testSetAddress() {
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        JohnBecker.setAddress(new Address("Willison", 1987, 0, "Minneapolis"));
        assertEquals(1987, JohnBecker.getAddress().getHouseNumber());
    }

}
