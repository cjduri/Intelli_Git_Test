package ch04.sec07;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("홀수 값을 입력하세요: ");
            n = scanner.nextInt();
        } while (n % 2 == 0);

        for (int i = 0; i < n; i++) {
            int stars = n - Math.abs(n - 2 * i);
            System.out.println(" ".repeat((n - stars) / 2) + "*".repeat(stars));
        }
        scanner.close();
    }
}


