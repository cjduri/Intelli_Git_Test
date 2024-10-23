package ch08.sec11.exam01;

public class CarExam {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.tire1 = new KumhoTire();
        System.out.println();
        myCar.tire2 = new KumhoTire();

        myCar.run();
    }
}
