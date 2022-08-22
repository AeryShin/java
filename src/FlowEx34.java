import java.util.*;

public class FlowEx34 {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

        outer:                                                                      // 중첩문 앞에 outer이름 이름 붙여줌
        while(true){
            System.out.println("(1) square");                                       // (1) square
            System.out.println("(2) square root");                                  // (2) square root
            System.out.println("(3) log");                                          // (3) log
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");                 // 원하는 메뉴(1~3)를 선택하세요.(종료:0)>

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if(menu==0){
                System.out.println("프로그램을 종료합니다.");                           // menu=0이면, 프로그램을 종료합니다 출력하고 if문을 빠져나감
                break;
            } else if(!(1<=menu && menu<=3)){
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");              // menu가 1보다 작거나 3보다 크면, 메뉴를 잘못 선택하셨습니다.(종료는 0) 출력하고, if 문으로 다시 올라감
                continue;
            }

            for(;;){                                                                // 무한 반복문, 위 if문에 속하지 않으면, for문으로 내려옴
                System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");   // 계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if(num==0)
                    break;                                                          // num이 0이면 for문을 종료하고, 그 전의 while문으로 돌아감 (반복문은 while, for 두 개가 존재)
                if(num==99)
                    break outer;                                                    // num이 99면 처음으로 돌아가지 않고 전체 반복문(프로그램) 종료

                switch (menu){
                    case 1:
                        System.out.println("result=" + num*num);                    // menu=1이면, 제곱을 출력 (ex.2입력하면 4출력)
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));             // num=2이면, 루트 출력 (ex.4입력하면 2출력)
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));              // num=3이면, log값 출력
                        break;
                }
            }
        }
    }
}