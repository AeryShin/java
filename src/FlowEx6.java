import java.util.*;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("현재 월을 입력하세요.>");                  // 현재 월을 입력하세요.>

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재의 계절은 여름입니다.");
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
            default:
            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
                /*
                case끼리 줄바꿈해도 되지만, 같은 줄에 써도 됨.
                유의할 것은 case 1처럼 case와 숫자 사이에 공백 필수
                 */
        }
    }
}
