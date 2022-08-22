import java.util.*;

public class FlowEx32 {
    public static void main(String[] args) {
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("(1) square");                           // (1) square
            System.out.println("(2) square root");                      // (2) square root
            System.out.println("(3) log");                              // (3) log
            System.out.print("원하는 메뉴(1~3)을 선택하세요.(종료:0)>");     // 원하는 메뉴 (1~3)을 선택하세요.(종료:0)>

            String tmp = scanner.nextLine();                            // tmp에 입력받음
            menu = Integer.parseInt(tmp);                               // menu 변수에 tmp를 int로 형변환한 값 저장

            if(menu==0){
                System.out.println("프로그램을 종료합니다.");               // menu=0이면 프로그램을 종료합니다 출력하고 break (빠져나옴)
                break;
            } else if(!(1<=menu && menu<=3)){                           // menu가 1보다 작거나, 3보다 크면 메뉴를 잘못 선택하셨습니다.(종료는 0) 출력
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;                                               // continue 문을 만나 아래 출력문을 출력하지 않고 다시 while로 돌아감
            }
            System.out.println("선택하신 메뉴는 " + menu + "번입니다.");    // else 문
        }
    }
}
