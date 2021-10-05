package labs.ch01;

import java.util.Scanner;

/**
 * класс MagicSquare с методами:
 * InputSquare() ввод квадрата с клавиатуры
 * InputSquare(int[][] sq1)ввод квадрата
 * IsMagicSquare(int[][] sq)  квадрат магический ?
 *
 */

public class MagicSquare {
    private int[][] sq;

    public boolean InputSquare() {
        int I;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону квадрата: ");
        I = in.nextInt();
        System.out.println("Вводите по одному элементы: ");
        sq = new int[I][];

        for (int i = 0; i < I; i++) {
            sq[i] = new int[I];
            for (int j = 0; j < I; j++) {
                System.out.print(i);
                System.out.print("|");
                System.out.print(j);
                System.out.print(" : ");
                sq[i][j] = in.nextInt();
                System.out.println();
            }
        }
        return IsMagicSquare(sq);
    }

    public boolean InputSquare(int[][] sq1) {
        if (!IsMagicSquare(sq1))
            return false;
        int size = sq1.length;
        sq = new int[size][];
        for (int i = 0; i < size; i++) {
            sq[i] = new int[size];
            for (int j = 0; j < size; j++) {
                sq[i][j] = sq1[i][j];
            }
        }
        return IsMagicSquare(sq);
    }

    public static boolean IsMagicSquare(int[][] sq) {
        //  int size= (int) pow(sq.length,0.5);
        int size = sq.length;
        int s = 0, s1, s2, s3, s4;
        for (int i = 0; i < size; i++) {
            s += sq[0][i];
        }
        for (int i = 0; i < size; i++) {
            s1 = 0;
            s2 = 0;
            s3 = 0;
            s4 = 0;
            for (int j = 0; j < size; j++) {
                s1 += sq[i][j];
                s2 += sq[j][i];
                s3 += sq[j][j];
                s4 += sq[j][-j - 1 + size];
            }
            if (s1 != s || s2 != s || s3 != s || s4 != s) {
                return false;
            }
        }
        return true;
    }
}
