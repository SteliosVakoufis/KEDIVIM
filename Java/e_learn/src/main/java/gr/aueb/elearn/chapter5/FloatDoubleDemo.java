package gr.aueb.elearn.chapter5;

public class FloatDoubleDemo {
    public static void main(String[] args) {
        float f = 10.5f;
        double d = 2.5;
        double result;
        double mod;

        result = f / d;
        mod = f % d;

        System.out.printf("The result is %5.3f and the mod is %5.3f",
        result, mod);
        
    }
}
