public class EmployeeTest {
    public static void main(String[] args) {
        Employee Dan = new Developer("Dan", "IT");

        System.out.println("The Developer "+Dan.getName()+ " is "+ Dan.work());

        Employee Steve = new Manager("Steve", "Corporate");

        System.out.println("The Manager "+Steve.getName()+ " is "+ Steve.work());

    }
}
