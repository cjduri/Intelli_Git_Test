package ch04.sec05;

public class SumFrom1ToExam {
    public static void main(String[] args) {
        int i = 0, sum = i;
        while (i<100)
            sum += ++i;
        System.out.print(sum);
    }
}
