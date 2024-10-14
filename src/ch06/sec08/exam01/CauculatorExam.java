package ch06.sec08.exam01;

public class CauculatorExam {
    public static void main(String[] args) {
        Calulator myCalc = new Calulator();

        myCalc.powerOn();
//        myCalc.powerOff();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 : " + result1);

//        int x = 10;
//        int y = 4;
        double result2 = myCalc.divide(10, 4);
        System.out.println("result2 : " + result2);

        myCalc.powerOff();
    }
}
