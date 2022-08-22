import java.util.*;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1;                        // answer은 1~100 사이의 임의의 수를 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.>");          // 1과 100 사이의 정수를 입력하세요.
            input = scanner.nextInt();

            if(input > answer){
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer){
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }                                                         // if-else문 종료
        } while (input!=answer);                                      // do-while문 종료. while(조건식);형태로, 조건식 상황일때 do문 반복
        System.out.println("정답입니다.");                              // while문이 의미하는 바와 반대인 input = answer일때, do-while문을 탈출하여 정답입니다 출력
    }
}
