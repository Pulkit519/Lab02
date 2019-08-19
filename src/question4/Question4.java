package question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        if (value1 > 0) {
            System.out.println("Positive");
        } else if (value1 == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Nagative");
        }

    }
}
