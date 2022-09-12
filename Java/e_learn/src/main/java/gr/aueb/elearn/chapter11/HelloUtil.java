package gr.aueb.elearn.chapter11;

/*
 * POJO (Plain Old Java Object) class
 */
public class HelloUtil {
    // No instnces of this class should be available
    private HelloUtil() {
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        HelloUtil.sayHello();
    }

}
