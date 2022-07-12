public class CastingEx4 {
    public static void main(String[] args) {
        int i = 91234567;
        float f = (float)i;     // i를 실수형으로 캐스팅해 f 변수에 저장
        int i2 = (int)f;        // i를 실수형으로 캐스팅한 것을 다시 정수형으로 캐스팅해서 i2 변수에 저장

        double d = (double)i;   // 정수형 i를 double형으로 캐스팅해 변수 d에 저장
        int i3 = (int)d;        // double형 d를 다시 정수형으로 형변환해 i3 변수에 저장

        float f2 = 1.666f;
        int i4 = (int)f2;       // 실수형 f2를 정수형으로 형변환해 i4에 저장

        System.out.printf("i=%d\n", i);             // i=91234567
        System.out.printf("f=%f i2=%d\n", f, i2);   // ① f=91234568.000000 i2=91234568
        System.out.printf("d=%f i3=%d\n", d, i3);   // ② d=91234567.000000 i3=91234567
        System.out.printf("(int)%f=%d\n", f2, i4);  // ③ (int)1.666000=1

        /*
        ① 정수형을 실수형 float로 형변환하면 소수점 6자리가 0으로 채워져서 출력되며, 기존 값 7자리만 정밀도를 가짐
        float타입을 다시 int형으로 형변환하면 반올림되었던 마지막자리수도 그대로 출력 = 기존값과 다른 출력

        ② double형으로 형변환해도 소수점 6자리가 0으로 채워져서 출력됨.
        float와 다른 점은 정밀도가 double형이 더 높이 지원되기 때문에, 반올림된 값이 아닌 실제 수를 저장함.
        때문에 다시 int형으로 형변환해도 기존의 수가 그대로 출력됨.

        ③ f2인 1.666을 출력하면 소수점 6자리가 나오며, 빈자리는 0으로 채워서 출력됨. 이를 정수형으로 바꾸면 소수점자리를 제외한 1만 출력

         */

    }
}
