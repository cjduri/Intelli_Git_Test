package exam19;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        String s1 = "ABC";
        String s2 = new String();
        String s3 = new String(c);
        String s4 = new String(c, 5, 3);
        String s5 = new String("XYZ");

        System.out.print("문자열:");
        String s6 = stdIn.next();

        System.out.println("s1 = " + s1);
        System.out.println("s2 = [" + s2 + "]");
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
    }
}
