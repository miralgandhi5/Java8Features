import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by miral on 6/23/2017.
 * Create a class Employee with name and age. Then write a program to print all those employees whose name start with n and age is greater then 24.
 */
public class Employee implements Serializable {
    String name;
    int age;


    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList();
        int age;
        String name;


        for (int v = 0; v < 4; ++v) {
            System.out.println("Enter employee age");
            age = sc.nextInt();
            System.out.println("Enter employee name");
            name = sc.next();
            Employee emp = new Employee(name, age);

            employeeList.add(emp);
        }

        System.out.println(employeeList.stream().filter(e -> e.name.startsWith("n")).filter(e -> e.age > 24).collect(Collectors.toList()));
    }


}
