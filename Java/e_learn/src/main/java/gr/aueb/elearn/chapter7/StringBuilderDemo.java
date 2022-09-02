package gr.aueb.elearn.chapter7;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder myStr = new StringBuilder();
        myStr.append("Hello ");
        myStr.append("ellos ");
        myStr.append("ello ");
        myStr.append("how ");
        myStr.append("hamburger ");

        System.out.printf("%s",
            myStr.toString()
        );
        System.out.println();

        long timeStart, timeEnd;

        timeStart = System.currentTimeMillis();
        StringBuilder myStr2 = new StringBuilder();
        for (int i = 0; i < 100_000_000; i++) {
            myStr2.append(i);
        }
        timeEnd = System.currentTimeMillis();

        System.out.printf("Execution time %dms",
            timeEnd - timeStart
        );

    }
}
