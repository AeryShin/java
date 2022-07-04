public class FloatEx1 {
    public static void main(String[] args) {
        float f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("     123456789012345678901234\n");   //    123456789012345678901234
        System.out.printf("f   : %f\n", f);        // f    : 9.123457 (f는 소수점 6자리까지 출력가능, 반올림)
        System.out.printf("f   : %24.20f\n", f);   // f    : 9.123456 다음에 랜덤난수 저장됨
        System.out.printf("f2  : %24.20f\n", f2); // f2   : 1.234567 다음에 랜덤난수 저장됨 (float 형은 정밀도 7까지)
        System.out.printf("d  : %24.20f\n", d);   // d    : 9.12345678901234 다음에 랜덤난수 저장됨 (double 형은 정밀도 15까지)

        /*
        습관적으로 sout (println)으로 출력했는데, 책보고 그대로 친 코드가 오류가 났다.
        왜인지 아무리 찾아도 모르겠다가, error 내용도 java 처음에 나온 에러 유형이 아니라 당황했다.
        그러다가 에러 내용 중 println이라는 글자에서 힌트를 얻을 수 있었다.
        결국 이유는 % (지시자)를 println 함수에서 사용해서였다.
        지시자를 사용하는 printf 함수로 바꾸었더니 에러가 없어졌다.
        에러 내용 : no suitable method found for println(java.lang.String,float)
         */
    }
}
