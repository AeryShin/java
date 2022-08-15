// 구구단 프로그램

public class FlowEx18 {
    public static void main(String[] args) {
        for(int i=2;i<=9;i++){                                          // 9줄 출력
            for(int j=1;j<=9;j++){
                System.out.printf("%d x %d = %d\n", i, j, i*j);         // 2x1=2 ... 2x9=18... 9x9=81까지 출력
            }
        }
    }
}
