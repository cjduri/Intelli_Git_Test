package ch05.sec08;

public class ArrayReferenceObjectExam {
    public static void main(String[] args) {
        String[] strArray = new String[4];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");
        strArray[3] = strArray[0];

        System.out.println(strArray[0] == strArray[1]);
        System.out.println(strArray[0] == strArray[2]);
        System.out.println(strArray[0].equals(strArray[2]));
        System.out.println(strArray[0] == strArray[3]);
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        System.out.println(strArray[3]);
        System.out.println(strArray);
    }
}
