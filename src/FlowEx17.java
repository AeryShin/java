import java.util.*;

public class FlowEx17 {
    public static void main(String[] args) {
        int num;

        System.out.print("*을 출력할 라인의 수를 입력하세요.>");              // *을 출력할 라인의 수를 입력하세요.>

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        for(int i=0;i<num;i++){                     // 10을 입력하면 10줄 출력
            for(int j=0;j<=i;j++){
                System.out.print("*");              // j<=i로 인해 * 개수가 하나씩 증가
            }
            System.out.println();                   // 줄바꿈해서 출력
        }

    }
}
