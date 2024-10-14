package ch02.sec12;

import java.util.Scanner;

public class Calcuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();
        System.out.println("숫자는 " + a + ", " + b + "입니다.");
        System.out.println(a + " + " + b + " = " + (a+b));
//        int c = a-b;
//        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.println(a + " * " + b + " = " + a*b);
        System.out.printf("%d / %d = %5.2f\n", a, b, (float)a/b);
        System.out.println(a + " % " + b + " = " + a%b);
    }
}
