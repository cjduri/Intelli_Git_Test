package ch06.sec07.exam03;

public class KoreanExam {
    public static void main(String[] args) {
        Korean kor0 = new Korean();
        Korean kor1 = new Korean("kim");
        Korean kor2 = new Korean("park", "blue");

        System.out.println("1차 이름: " + kor1.name);

        System.out.println("2차 이름: " + kor2.name);
        System.out.println("2차 색상: " + kor2.ssn);
    }
}
