// x의 n제곱 계산하는 메서드 : f(x, n) = x * f(x, n-1)

public class PowerTest {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for(int i=1;i<=n;i++){
            result += power(x, i);              //
        }
        System.out.println(result);
    }

    static long power(int x, int n){
        if(n==1) return x;
        return x * power(x, n-1);
    }

}
