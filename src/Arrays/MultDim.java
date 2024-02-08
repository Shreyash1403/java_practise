package Arrays;

import java.util.Scanner;

class MultDim {
    public static void main(String[] args) {
        System.out.println("Enter an Array:");
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}