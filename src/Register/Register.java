package Register;

import java.util.*;

public class Register {
    public static void main(String[] args) {
        Employees employees = new Employees();

        Office JohnBecker = new Office("John", "Becker", 43, 80, new Address("Willison", 1978, 0, "Minneapolis"), 132);
        Labourer RandallCampbell = new Labourer("Randall", "Campbell", 28, 40, new Address("Ella", 3797, 0, "Millbrae"), 92);
        Dealer PaulAdams = new Dealer("Paul", "Adams", 36, 90, new Address("Kelly", 3862, 0, "Charlotte"), Dealer.Efficiency.HIGH, 15);

        employees.add(JohnBecker);
        employees.add(Arrays.asList(RandallCampbell, PaulAdams));

        System.out.println("\nAll employees:");
        employees.getEmployees().forEach(Employee::print);

        System.out.println("\nAll employees from Charlotte:");
        employees.getEmployeesFromCity("Charlotte").forEach(Employee::print);

        System.out.println("\nAll employees with their values:");
        employees.getEmployeesWithTheirValues();
    }
}
