package ch11.sec02.exam02;

public class ExceptionHandlingExam {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String3");
            System.out.println("java.lang.String3 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("&&");

        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
