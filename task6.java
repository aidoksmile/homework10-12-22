// Дан массив целых чисел. 
// Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input array lenght: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Input array elements: ");
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            
            if (Math.abs(arr[i]) < 100 & Math.abs(arr[i]) > 10) {
                sum += i;
            }
            System.out.println("Indexes amount = " + sum);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[i] = sum;
            }
            System.out.print(arr[i]);
        }
        scanner.close();
    }
}