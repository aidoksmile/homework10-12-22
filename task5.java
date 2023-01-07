// Дан массив целых чисел. 
// Найти сумму элементов, у которых последняя и предпоследняя цифры равны.

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input array lenght: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Input array elements: ");

        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 10 == (arr[i] / 10) % 10) {
                sum += arr[i];
            }
        }
        
        System.out.println("amount = " + sum);
        scanner.close();
    }
}