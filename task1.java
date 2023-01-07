// Дана последовательность N целых чисел. 
// Найти количество положительных чисел, после которых следует отрицательное число.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int a, b, quantity = 0, n;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input N: ");
        n = scanner.nextInt();

        System.out.println("Input elements: ");
        a = scanner.nextInt();
        
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 & b < 0) {
                quantity += 1;
            }
            a = b;
        }
        System.out.println("Amount is: " + quantity);
        scanner.close();
    }
}