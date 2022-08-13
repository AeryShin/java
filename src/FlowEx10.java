import java.util.*;

public class FlowEx10 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("당신의 점수를 입력하세요.(0~100)>");             // 당신의 점수를 입력하세요.(0~100)?>

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();                              // 문자열 변수 tmp에 입력받은 값 저장
        score = Integer.parseInt(tmp);                                // 변수 score에 문자열 tmp를 int형으로 형변환

        switch(score/10){
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("당신의 학점은 " + grade + "입니다.");
        }
        /*
        parseInt : int형으로 형변환
        String과 nextLine() 세트 / int와 nextInt() 세트
        5번째 줄과 12번 줄을 없애고, int score = scanner.nextInt();로 바꿔도 같은 결과 출력
         */
}
