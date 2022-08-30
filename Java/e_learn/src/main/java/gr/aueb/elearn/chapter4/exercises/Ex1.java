package gr.aueb.elearn.chapter4.exercises;

// Lines and stuff.
public class Ex1 {
    public static void main(String[] args) {
        createSquareOutline();
    }

    private static void createSquareOutline(){
        final int WIDTH = 14, HEIGHT = 6;

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++){
                System.out.printf("%c",
                    i == 0 || i == HEIGHT - 1 || j == 0 || j == WIDTH - 1 ? '*' : ' ');
            }
            System.out.println();
        }
    }
    
}
