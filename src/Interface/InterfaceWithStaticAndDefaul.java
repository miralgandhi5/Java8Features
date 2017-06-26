package Interface;

/**
 * Created by miral on 6/23/2017.
 *  Write a program having interface with default and static methods and call them also in your main method
 */
public interface InterfaceWithStaticAndDefaul {

    default void show()
    {
        System.out.println("This is the feature of java 8 that enable default method in interface");
    }

    static void demo(){
        System.out.println("This is the static method in interface");
    }

}
