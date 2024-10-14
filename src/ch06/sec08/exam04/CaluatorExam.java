package ch06.sec08.exam04;

public class CaluatorExam {
    public static void main(String[] args) {
        Calulator myCaldu = new Calulator();

        double result1 = myCaldu.areaRectangle(10);

        double result2 = myCaldu.areaRectangle(10, 20);

        System.out.println("정사각형 넓이=" + result1);
        System.out.println("직사각형 넓이=" + result2);
    }
}
