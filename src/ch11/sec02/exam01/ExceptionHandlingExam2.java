package ch11.sec02.exam01;

public class ExceptionHandlingExam2 {
    public static void printLength(String data) {
        try {
            int result = data.length(); // 문자열의 길이를 계산
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) { // NullPointerException 발생 시 처리
            //System.out.println(e.getMessage()); // 에러 메시지를 출력
            //System.out.println(e.toString()); // e.toString()으로 에러 객체 출력
            e.printStackTrace(); // 스택 트레이스를 출력
        } catch (Exception e) { // NullPointerException 발생 시 처리
            System.out.println("문자를 입력하지 않았습니다.");
        } finally {
            System.out.println("[마무리 실행]\n"); // 예외 발생 여부와 관계없이 항상 실행
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava"); // 정상적인 문자열 전달
        printLength(null); // null 값을 전달하여 예외 발생
        System.out.println("[프로그램 종료]");
    }
}
