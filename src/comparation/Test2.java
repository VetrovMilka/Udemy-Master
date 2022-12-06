package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Miroslav", "Vetrov", 1000);
        Employee emp2 = new Employee(11, "Zlata", "Vetrova", 10);
        Employee emp3 = new Employee(102, "Ivan", "Baltagi", 2342);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before the sorting \n" + list);
        Collections.sort(list, new NameComparator());
        System.out.println("After the sorting \n" + list);
    }

}
class Employee implements Comparable<Employee>{

    @Override
    public int compareTo(Employee anotherEmp) {
        return Integer.compare(this.id, anotherEmp.id);
    }

    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


   }
//class IdComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee emp1, Employee emp2) {
//        return Integer.compare(emp1.id, emp2.id);
//    }
//}
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        int res = emp1.name.compareTo(emp2.name);
        if (res == 0)
            res = emp1.surname.compareTo(emp2.surname);
        return res;
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary - emp2.salary;
    }
}
