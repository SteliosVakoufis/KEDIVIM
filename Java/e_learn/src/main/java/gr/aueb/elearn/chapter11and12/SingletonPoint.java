package gr.aueb.elearn.chapter11and12;

/*
 * Creates an eager singleton point
 */
public class SingletonPoint {
    private int x;
    private int y;

    private static final SingletonPoint SP = new SingletonPoint();        

    private SingletonPoint() {}

    public static SingletonPoint getInstance() {
        return SP;
    }

}
