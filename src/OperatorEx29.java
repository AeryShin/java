public class OperatorEx29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = -10;

        System.out.printf(" p = %d \t%s\n", p, toBinaryString(p));      // p = 10, 10을 32bit로 표현
        System.out.printf("~p = %d \t%s\n", ~p, toBinaryString(~p));    // ~p = -11, 32bit로 표현
        System.out.printf("~p+1 = %d \t%s\n", ~p+1, toBinaryString(~p+1));  // -10
        System.out.printf("~~p = %d \t%s\n", ~~p, toBinaryString(~~p)); // 10
        System.out.println();                                           // 공백 한줄 띄기
        System.out.printf(" n = %d\n", n);                              // n = -10
        System.out.printf("~(n-1) = %d\n", ~(n-1));                     // ~(n-1) = 10

    }
    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }

}
