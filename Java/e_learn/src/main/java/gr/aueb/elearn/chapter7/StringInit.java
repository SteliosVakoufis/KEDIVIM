package gr.aueb.elearn.chapter7;

public class StringInit {
    public static void main(String[] args) {
        StringBuilder strBob = new StringBuilder();
        strBob.append("Hello World!\n");
        strBob.append("My name is John Cena!\n");
        strBob.append("~music playing~\n");

        String myStr = strBob.toString();
        
        System.out.println(myStr);
    }
}
