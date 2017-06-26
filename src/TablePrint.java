import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by miral on 6/22/2017.
 *  Write a program to print a table of any number using lambda expression
 */
public class TablePrint {
    public static void main(String[] args) {
        System.out.println("please enter a no.for table");
        Scanner sc = new Scanner(System.in);
        final int no = sc.nextInt();
        IntStream.rangeClosed(1, 10).forEach(e -> System.out.println(no + "*" + e + "=" + e * no));
    }

}
