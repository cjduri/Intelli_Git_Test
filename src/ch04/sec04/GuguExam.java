package ch04.sec04;

public class GuguExam {
    public static void main(String[] args) {
        for(int i=2;i<=9;i+=4)
            for(int j=1;j<=9;j++) {
                System.out.printf("\n%d * %d = %2d", i, j, i * j);
                System.out.printf("\t%d * %d = %2d", i+1, j, (i+1) * j);
                System.out.printf("\t%d * %d = %2d", i+2, j, (i+2) * j);
                System.out.printf("\t%d * %d = %2d", i+3, j, (i+3) * j);
            }

        System.out.println();

        for(int j=1;j<=9;j++) {
            for (int i = 2; i <= 9; i++)
                System.out.printf("%d * %d = %2d\t", i, j, i * j);
            System.out.println();
        }
    }
}
