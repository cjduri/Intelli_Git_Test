package ch02.sec12;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String name = "김자바";
        int age = 25;
        String position = "기흥";
        double myRate = 23.4527;
//        String string = new String(System.in);

        System.out.println("사는곳: " + position + ", 이름: " + name + ", 실적율: " + myRate);
        System.out.printf("사는곳: %3$3s\n이름: %2$4s\n실적율: %1$5.2f", myRate, name, position);
    }
}
