public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);                  // 24 (4*3*2*1)
        System.out.println(result);
    }
    // factorial 메서드도 main 함수와 같은 class에 있으므로, 호출할 때 FactorialTest.factorial(4) 대신, factorial(4)가 가능
    static int factorial(int n){
        int result = 0;

        if(n==1){
            result = 1;
        } else {
            result = n*factorial(n-1);
        }
        return result;
    }
}
