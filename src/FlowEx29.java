// 369 게임 코딩

public class FlowEx29 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            System.out.printf("i=%d ", i);              // i=1

            int tmp = i;

            do {
                if(tmp%10%3==0 && tmp%10!=0){           // tmp%10이 0이 아니면서, 3의 배수면 짝 출력
                    System.out.printf("짝");
                }
            } while((tmp/=10)!=0);                      // tmp = tmp/10 (즉, tmp/10이 0이면 빠져나옴)
            System.out.println();
        }
    }
}
