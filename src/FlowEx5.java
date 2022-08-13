import java.util.*;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';

        System.out.print("점수를 입력해주세요.>");                   // 점수를 입력해주세요.>

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다.", score);         // 당신의 점수는 (입력)입니다.

        if(score >= 90){                                         // if
            grade = 'A';
            if(score >= 98){                                     // 중첩 if문 (if-else if)
                opt = '+';
            } else if(score < 94){
                opt = '-';
            }
        } else if (score >= 80) {                                 // else if (다른 case)
            grade = 'B';
            if(score >= 88){                                      // 중첩 if문 (if-else if)
                opt = '+';
            } else if(score < 84){
                opt = '-';
            }
        } else {                                                  // else (그 외)
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.\n", grade, opt);    // 당신의 학점은 ~입니다.
        /*
        85를 입력하면, 88 이상(+)도 아니고 84 미만도 아니기 때문에 B0이 출력된다. => opt = '0'으로 초기화했기 때문
         */
    }
}
