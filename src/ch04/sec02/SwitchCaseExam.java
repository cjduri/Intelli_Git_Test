package ch04.sec02;

public class SwitchCaseExam {
    public static void main(String[] args) {
        int score = (int)(Math.random()*101) + 0;
        System.out.println(score);

        switch(score / 10) {
            case 10:
            case 9:
                System.out.println("점수가 100-90입니다.");
                System.out.println("등급은 A입니다.");
                break;
            case 8:
                System.out.println("점수가 80-89입니다.");
                System.out.println("등급은 B입니다.");
                break;
            case 7:
                System.out.println("점수가 70-79입니다.");
                System.out.println("등급은 C입니다.");
                break;
            default:
                System.out.println("점수가 70보다 작습니다.");
                System.out.println("등급은 D입니다.");
        }
    }
}
