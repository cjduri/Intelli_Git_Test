package ch00.sec11;

import java.util.Scanner;

public class GuGu {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("구구단 몇 단?:");
        int i = stdIn.nextInt();
        for (int j = 1; j <= 9; j++)
            if (j == 9)
                System.out.print(i + " * " + j + " = " + i*j);
            else
                System.out.println(i + " * " + j + " = " + i*j);
    }
}
