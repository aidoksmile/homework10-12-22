// Дана последовательность из N целых чисел. 
// Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int a, b, n;
        boolean seq = true;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Input N: ");
        n = scanner.nextInt();

        System.out.println("Input elements: ");
        a = scanner.nextInt();
        
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (a > b) {
                seq = false;
            }
            a = b;
        }
        scanner.close();

        if (seq == true) {
            System.out.println("The sequence increases.");
        } else {
            System.out.println("The sequence decreases.");
        }
    }
}