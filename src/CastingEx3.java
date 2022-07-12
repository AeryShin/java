public class CastingEx3 {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;      // float -> double 형변환(캐스팅)해서 d2 변수에 저장


        System.out.printf("f = %20.18f\n", f);          // 소수점 아래 자리수는 18개
        System.out.printf("d = %20.18f\n", d);          // 같은 값을 저장해도, double이 정밀도가 더 높음
        System.out.printf("d2 = %20.18f\n", d2);        // d2 =
    }
}
