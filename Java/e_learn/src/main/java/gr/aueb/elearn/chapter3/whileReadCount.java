package gr.aueb.elearn.chapter3;

public class whileReadCount {
    public static void main(String[] args) {
        float bias = 0.90f;
        int range = 100;
        int current = Integer.MIN_VALUE;
        int tries = 0;

        while (current < 0){
            tries++;
            current = (int)((Math.random() * range) - (range * bias));
            System.out.println(current);
        }

        System.out.printf("You got a possitive number after %d tries!",
            tries);

    }
}
