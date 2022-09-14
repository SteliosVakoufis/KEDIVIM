package gr.aueb.elearn.chapter14;

public interface IDefaultDemo {
    default void sayHello() {
        System.out.println("Hello");
    }

    static void sayHi() {
        System.out.println("Hi");
    }
    
}
