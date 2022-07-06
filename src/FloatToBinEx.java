public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;               // 실수 변수 선언
        int i = Float.floatToIntBits(f);    // f변수를 int형으로 변환한 값을 i에 저장

        System.out.printf("%f\n", f);       // 9.1234567f
        System.out.printf("%X\n", i);       // 16진수 출력

    }
}
