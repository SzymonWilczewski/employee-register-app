package Register;

import java.util.*;
import java.util.stream.*;

public class Employees {
    private final List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() { return employees; }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public void add(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void remove(String id) {
        employees.removeIf(e -> e.getId().equals(id));
    }

    public List<Employee> sortExpDesAgeAscSurAsc() {
        return employees.stream()
                .sorted(new SortExpDesAgeAscSurAsc())
                .collect(Collectors.toList());
    }

    public List<Employee> getEmployeesFromCity(String city) {
        return employees.stream()
                .filter(e -> e.getAddress().getCity().equals(city))
                .collect(Collectors.toList());
    }

    public void getEmployeesWithTheirValues() {
        employees.forEach(e -> System.out.printf("%s %s\nValue: %s\n", e.getName(), e.getSurname(), e.getValue()));
    }
}

class SortExpDesAgeAscSurAsc implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getExperience() == e2.getExperience()) {
            if (e1.getAge() == e2.getAge()) {
                return e1.getSurname().compareTo(e2.getSurname());
            } else {
                return e1.getAge() - e2.getAge();
            }
        } else {
            return e2.getExperience() - e1.getExperience();
        }
    }
}
