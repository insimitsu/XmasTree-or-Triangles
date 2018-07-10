import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Type height of a tree: ");
        int height = userInput.nextInt();
        int i = 0, j = 0, k = 0;
        makeTree(i, j, k, height);
    }

    private static void makeTree(int i, int j, int k, int height) {
        System.out.println();
        for (i = 0; i <= height - 1; i++) {
            for (j = (height - 1); j > i; j--) {
                System.out.print(" ");
            }
            for (k = 2 * i; k >= 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
