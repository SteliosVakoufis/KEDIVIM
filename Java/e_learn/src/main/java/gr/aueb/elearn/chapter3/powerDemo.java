package gr.aueb.elearn.chapter3;

public class powerDemo {
    public static void main(String[] args) {
        double myNumber = Math.ceil(Math.random() * 8);
        double pow = Math.ceil((Math.random() * 10) + 2);
        System.out.printf("The power of %.0f at %.0f is %.0f",
            myNumber, pow, Math.pow(myNumber, pow));
    }
}
