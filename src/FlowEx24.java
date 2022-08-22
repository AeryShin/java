public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;

        System.out.println("카운트 다운을 시작합니다.");           // 카운트 다운을 시작합니다.

        while(i--!=0){
            System.out.println(i);                            // 10 9 8 7 6 5 4 3 2 1 0
            for(int j=0;j<2_000_000_000;j++){
                ;                                             // for문을 이용해 약간의 시간이 지연되도록 함 (비어있어도 됨)
            }
        }
        System.out.println("GAME OVER");                      // GAME OVER
    }
}
