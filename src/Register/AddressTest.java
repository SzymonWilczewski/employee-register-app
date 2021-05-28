package Register;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressTest {

    @Test
    public void testGetStreet() {
        Address address = new Address("Willison", 1978, 0, "Minneapolis");
        assertEquals("Willison", address.getStreet());
    }

    @Test
    public void testGetHouseNumber() {
        Address address = new Address("Willison", 1978, 0, "Minneapolis");
        assertEquals(1978, address.getHouseNumber());
    }

    @Test
    public void testGetFlatNumber() {
        Address address = new Address("Willison", 1978, 0, "Minneapolis");
        assertEquals(0, address.getFlatNumber());
    }

    @Test
    public void testGetCity() {
        Address address = new Address("Willison", 1978, 0, "Minneapolis");
        assertEquals("Minneapolis", address.getCity());
    }

    @Test
    public void testSetStreet() {
        Address address = new Address("Willison", 1978, 0, "Minneapolis");
        address.setStreet("Clark");
        assertEquals("Clark", address.getStreet());
    }

    @Test
    public void testSetHouseNumber() {
        Address address = new Address("Willison", 1978, 0, "Minneapolis");
        address.setHouseNumber(1987);
        assertEquals(1987, address.getHouseNumber());
    }

    @Test
    public void testSetFlatNumber() {
        Address address = new Address("Willison", 1978, 0, "Minneapolis");
        address.setFlatNumber(1);
        assertEquals(1, address.getFlatNumber());
    }

    @Test
    public void testSetCity() {
        Address address = new Address("Willison", 1978, 0, "Minneapolis");
        address.setCity("Los Angeles");
        assertEquals("Los Angeles", address.getCity());
    }

}
