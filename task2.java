// Дана последовательность целых чисел, оканчивающаяся нулем. 
// Найти сумму положительных чисел, после которых следует отрицательное число.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int a, b = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input elements with 0 in end: ");
        a = scanner.nextInt();
        
        while (b != 0) {
            b = scanner.nextInt();
            if (a > 0 & b < 0) {
                sum += a;
            }
            a = b;
        }
        System.out.println("amount = " + sum);
        scanner.close();
    }
}