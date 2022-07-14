public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0==10.0f %b\n", 10.0==10.0f);     // 10.0==10.0f       true
        System.out.printf("0.1==0.1f %b\n", 0.1==0.1f);         // ① 0.1==0.1f      false
        System.out.printf("f = %19.17f\n", f);                  // f = 0.1......쓰레기값
        System.out.printf("d = %19.17f\n", d);                  // d = 0.1.........쓰레기값
        System.out.printf("d2 = %19.17f\n", d2);                // d2 = 0.1.....쓰레기값
        System.out.printf("d==f %b\n", d==f);                   // ② d==f           false
        System.out.printf("d==d2 %b\n", d==d2);                 // d==d2            false
        System.out.printf("d2==f %b\n", d2==f);                 // ③ d2==f          true
        System.out.printf("(float)d==f %b\n", (float)d==f);     // ④ (float)d==f    true

        /*
        %19.17 = 소수점 자리 17자리 출력
        ① 10.0==10.0f [true] VS 0.1==0.1f [false] 차이 : 정수형과 달리 실수형은 근사값으로 저장되므로 오차 발생 가능
        ② float 0.1f와 double 0.1은 다른 값으로 나옴 (정밀도 차이)
        ③ d2는 f를 double형으로 형변환한 변수로, 쓰레기값이 포함된 double형이므로, f와 값이 같음 = true
        ④ 큰 타입인 double에서 작은 타입인 float으로 변환하는 것은 쓰레기값이 추가되지 않음 = true
         */
    }
}
