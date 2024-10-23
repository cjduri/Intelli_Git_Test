package ch12.sec03.exam05;

public class Calculator {

    // 더하기
    public double add(double a, double b) {
        double c = 0;
        c = a + b;
        return c;
    }

    // 빼기
    public double sub(double a, double b) {
        return a - b;
    }

    // 곱하기
    public double mul(double a, double b) {
        return a * b;
    }

    // 나누기
    public double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return a / b;
    }
}

