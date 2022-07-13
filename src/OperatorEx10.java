public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 100000;
        int result1 = a * a / a;
        int result2 = a / a * a;

        System.out.printf("%d * %d / %d = %d\n", a, a, a, result1); // 100000 * 100000 / 100000 = 쓰레기값 (오버플로우 발생)
        System.out.printf("%d / %d * %d = %d\n", a, a, a, result2);  // 100000 / 100000 * 1000000 = 100000 (정상)
        /*
        먼저 곱하면, int형의 범위가 넘어서기 때문에 그 후에 나눠도 쓰레기값 출력
        먼저 나누고, 곱하면 int형의 범위가 넘어서지 않기 때문에 정상출력
         */
    }
}
