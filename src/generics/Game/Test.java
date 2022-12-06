package generics.Game;

public class Test {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Ivan", 12);
        Scholar scholar2 = new Scholar("Miroslav", 15);

        Student student1 = new Student("Petya", 20);
        Student student2 = new Student("Nikita", 21);

        Employee employee1 = new Employee("Fyodor", 44);
        Employee employee2 = new Employee("Karl", 43);

        Team<Scholar> scholarTeam = new Team("Dragons");
        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);

        Team<Student> studentTeam = new Team("Pussies");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team("GO!");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Scholar scholar3 = new Scholar("Ivan", 12);
        Scholar scholar4 = new Scholar("Miroslav", 15);

        Student student3 = new Student("Petya", 20);
        Student student4 = new Student("Nikita", 21);

        Employee employee3 = new Employee("Fyodor", 44);
        Employee employee4 = new Employee("Karl", 43);

        Team<Scholar> scholarTeam2 = new Team("Sages");
        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);

        Team<Student> studentTeam2 = new Team("Siths");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam2 = new Team("BBC!");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        scholarTeam.playWith(scholarTeam2);
//        scholarTeam.playWith(studentTeam2);


    }
}
