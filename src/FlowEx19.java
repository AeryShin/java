public class FlowEx19 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=3;k++){
                    System.out.println(""+i+j+k);               // 111 112 113 ... 333
                }
            }
        }
    }
}
/*
""가 있으므로서, i+j+k를 계산해서 출력하는 게 아니라, 문자열 형태로 ijk를 나열함
 */