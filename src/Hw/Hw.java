package Hw;

import java.util.Arrays;

public class Hw {
    public static void main(String[] args) {

//8. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

        int k = 1;
        int arr[][] = new int[5][6];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = k;
                k++;
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
