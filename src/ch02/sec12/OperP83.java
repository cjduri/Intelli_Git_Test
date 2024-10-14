package ch02.sec12;

import java.util.Scanner;

public class OperP83 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("자연수는?:");
        int i = stdIn.nextInt();
        if (i > 0) {
            if (i % 2 == 0)
                System.out.println("짝수.");
            else
                System.out.println("홀수.");
        }
        else
            System.out.println("자연수가 아님.");
    }
}
