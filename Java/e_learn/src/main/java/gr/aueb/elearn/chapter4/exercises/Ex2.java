package gr.aueb.elearn.chapter4.exercises;

//
public class Ex2 {
    public static void main(String[] args) {
        createSquareFilled();
    }

    private static void createSquareFilled(){
        final int WIDTH = 14, HEIGHT = 6;

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++){
                System.out.printf("%c",
                    '*');
            }
            System.out.println();
        }
    }
    
}
