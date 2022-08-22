public class FlowEx33 {
    public static void main(String[] args) {
        Loop1 : for(int i=2;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j==5)
                    break Loop1;
                    // break;
                    // continue Loop1;
                    // continue;
                System.out.println(i + "*" + j + "=" + i*j);                // ①
            }
            System.out.println();
            /*
            ① 2*1=2   2*2=4   2*3=6   2*4=8 (j==5면 break이기 때문에 모든 중첩 반복문을 빠져나옴)
            Loop1 :을 통해, 중첩반복문 앞에 이름을 붙여 break Loop1을 입력하면 모든 중첩문을 빠져나옴
            만약, break Loop1을 break로 수정하면 반복문 하나만을 탈출하기 떄문에, 3*4 ... 9*4까지 모두 출력
             */
        }
    }
}
