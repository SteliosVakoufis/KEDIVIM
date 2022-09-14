package gr.aueb.elearn.chapter11and12;

/*
 * A lazy singleton
 */
public class SingletonLazyPoint {
    private int x;
    private int y;

    private static SingletonLazyPoint SP;

    private SingletonLazyPoint() {
    }

    public static SingletonLazyPoint getInstance() {
        if (SP == null)
            SP = new SingletonLazyPoint();

        return SP;
    }

}
