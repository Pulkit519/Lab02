package question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character1 = scanner.nextLine().trim().charAt(0);
        char character2 = scanner.next().trim().charAt(0);
        if (character1 < character2) {
            System.out.println(character1 + " " + character2);
        } else {
            System.out.println(character2 + " " + character1);
        }
        scanner.close();
    }
}
