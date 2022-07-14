import java.util.*;                                       // ①

public class OperatorEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자를 하나 입력하세요.>");            // 문자를 하나 입력하세요.

        String input = scanner.nextLine();
        ch = input.charAt(0);                                 // 입력한 input string에서 첫 번째 문자를 추출해서 ch에 저장

        if('0'<=ch && ch<='9'){
            System.out.printf("입력하신 문자는 숫자입니다.\n");     // (7이면) 입력하신 문자는 숫자입니다.
        }

        else if(('a'<=ch && ch<='z') || ('A'<=ch && ch<='Z')){
            System.out.printf("입력하신 문자는 영문자입니다.\n");    // (문자면) 입력하신 문자는 영문자입니다.
        }
        else {
            System.out.println("지원하지 않는 문자입니다.\n");      // ② 개인실습 추가코드
        }
    /*
    ① import java.util.*를 선언해야 Scanner 함수를 사용할 수 있음.
    ② : 개인실습 추가코드 (ex. 한글 입력했을 때)
    ※ 문자열 중 처음 문자만으로 판별하는 코드이기 때문에, 만약 2abc를 입력하면 "입력하신 문자는 숫자입니다" 출력
     */

    }
}
