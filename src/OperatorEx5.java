public class OperatorEx5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d\n", a, b, a+b);                 // 10 + 4 = 14
        System.out.printf("%d - %d = %d\n", a, b, a-b);                 // 10 - 4 = 6
        System.out.printf("%d * %d = %d\n", a, b, a*b);                 // 10 * 4 = 40
        System.out.printf("%d / %d = %d\n", a, b, a/b);                 // 10 / 4 = 2
        System.out.printf("%d / %f = %f\n", a, (double)b, a/(double)b);   // 10 / 4.000000 = 2.50000
        
        /*
        float형은 소수점 6자리 출력, double형도 마찬가지로 소수점 자리까지 출력을 지원함
         */
    }
}
