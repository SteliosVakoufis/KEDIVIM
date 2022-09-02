package gr.aueb.elearn.chapter7;

public class SplitStringDemo {
    public static void main(String[] args) {
        String myStr = "Hello,      how is it going?";
        String[] split = myStr.split(" +");

        for (String str : split) {
            System.out.println(str);
            // System.out.printf("%s ",
            //     str
            // );
        }
        
    }
}
