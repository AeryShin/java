public class FlowEx20 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.printf("[%d,%d]", i, j);             // [1,1] [1,2] ..[1,5] 줄바꿈 ... [5,5]
            }
            System.out.println();
        }
    }
}
