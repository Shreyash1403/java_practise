package Arrays;

import java.util.Scanner;
import java.util.Arrays;

class array1 {
    public static void main(String[] args) {
        System.out.println("Enter an array:");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        arr[3] = 5;

        String[] str = new String[4];
        System.out.println("Enter strings:");
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(arr)); // optional
        System.out.println(Arrays.toString(str)); // optional
    }
}
