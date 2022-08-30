package gr.aueb.elearn.chapter2;

// H fantastiki Math.random() opu mas kani
// return enan double apo to 0.0 eos to 1.0!!!
public class RandomDemo {
    public static void main(String[] args) {
        giveMeRandoms(10, 100);
    }

    private static void giveMeRandoms(int count, int range){
        for (int i = 1; i <= count; i++) {
            System.out.printf("repeat: %d value is %d\n",
                    i, (int)(Math.random() * range));
        }
    }
}
