import java.util.*;         // scanner 사용할 수 있음

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);           // Scanner 객체 생성

        System.out.print("두자리 정수를 하나 입력해주세요.>");    // 문자열 출력
        String input = scanner.nextLine();                  // 문자열 입력받아 input에 저장
        int num = Integer.parseInt(input);                  // input에 있는 문자열을 정수로 변환해 num에 저장

        System.out.println("입력내용 :"+input);               // 입력내용 :(정수)
        System.out.printf("num=%d\n", num);                 // num=정수

    }
}
