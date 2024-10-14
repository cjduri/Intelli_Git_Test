package ch05.sec11;

public class MainStringArrayArgumentExam {

    public static void main(String[] args) {
        // 입력된 두 개의 숫자를 더하는 프로그램

        // 입력된 인자가 2개가 아닐 경우 오류 메시지 출력 후 프로그램 종료
        if (args.length != 2) {
            System.out.println("프로그램 입력값이 부족합니다.");
            System.exit(0);
        }

        // 첫 번째 인자를 문자열로 저장
        String strNum1 = args[0];
        // 두 번째 인자를 문자열로 저장
        String strNum2 = args[1];

        // 문자열을 정수로 변환
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        // 두 수를 더하고 결과를 저장
        int result = num1 + num2;

        // 결과 출력 (문자열 연결 연산자 사용)
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
