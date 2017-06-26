import java.io.*;

/**
 * Created by miral on 6/26/2017.
 * Write a program to serialize a class Employee with property name and then deserialize it.
 */
public class SerializationDeserializationDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul",25);


        try {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in employee.txt");
        }catch(IOException i) {
            i.printStackTrace();
        }

        Employee emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (Employee) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + emp.name);
            System.out.println("Age: " + emp.age);
        }catch(IOException i) {
            i.printStackTrace();

        }catch(ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();

        }


    }
}
