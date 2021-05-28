package Register;

import java.util.*;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeesTest {

    @Test
    public void testGetEmployees() {
        Employees employees = new Employees();
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        employees.add(JohnBecker);
        assertEquals("John", employees.getEmployees().get(0).getName());
    }

    @Test
    public void testAddOneEmployee() {
        Employees employees = new Employees();
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        employees.add(JohnBecker);
        assertEquals(1, employees.getEmployees().size());
    }

    @Test
    public void testAddManyEmployees() {
        Employees employees = new Employees();
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 135);
        Labourer RandallCampbell = new Labourer("Randall", "Campbell", 28, 40, new Address("Ella", 3797, 0, "Millbrae"), 92);
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);
        employees.add(Arrays.asList(JohnBecker, RandallCampbell, PaulAdams));
        assertEquals(3, employees.getEmployees().size());
    }

    @Test
    public void testRemoveEmployee() {
        Employees employees = new Employees();
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        String id = JohnBecker.getId();
        employees.add(JohnBecker);
        employees.remove(id);
        assertEquals(0, employees.getEmployees().size());
    }

    @Test
    public void testSortExpDesAgeAscSurAsc() {
        Employees employees = new Employees();
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        Labourer RandallCampbell = new Labourer("Randall", "Campbell", 28, 40, new Address("Ella", 3797, 0, "Millbrae"), 90);
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);
        employees.add(Arrays.asList(JohnBecker, RandallCampbell, PaulAdams));
        assertEquals(Arrays.asList(PaulAdams, JohnBecker, RandallCampbell), employees.sortExpDesAgeAscSurAsc());
    }

    @Test
    public void testGetEmployeesFromCity() {
        Employees employees = new Employees();
        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        Labourer RandallCampbell = new Labourer("Randall", "Campbell", 28, 40, new Address("Ella", 3797, 0, "Millbrae"), 95);
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);
        employees.add(Arrays.asList(JohnBecker, RandallCampbell, PaulAdams));
        assertEquals(Collections.singletonList(PaulAdams), employees.getEmployeesFromCity("Charlotte"));
    }

}
