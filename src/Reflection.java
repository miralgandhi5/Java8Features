import java.lang.reflect.Method;
import java.lang.reflect.Field;

/**
 * Created by miral on 6/26/2017.
 * Write a program to read all field and method names of a class using reflection
 */
public class Reflection {
    public static void main(String[] args) {
        Employee employee=new Employee("Rahul",25);

        Field [] fields = employee.getClass().getDeclaredFields();
        for(Field field: fields){
            System.out.println(field.getType()+"--"+field.getName());
        }


        Method[] methods= employee.getClass().getDeclaredMethods();
        for (Method field : methods ){
            System.out.println(field.getName());
            System.out.println(field.getModifiers());

        }
    }
}
