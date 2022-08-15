public class FlowEx21 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j){
                    System.out.printf("[%d,%d]", i, j);     // [1,1] ... [5,5]
                } else{
                    System.out.printf("%5c", ' ');          // i와 j가 다르면 공백 출력
                }
            }
            System.out.println();                           // 줄바꿈
        }
    }
}
