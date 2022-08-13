public class OperatorEx28 {
    public static void main(String[] args) {
        int x = 0xAB, y = 0xF;                  // 0x는 숫자 0

        System.out.printf("x = %#X \t\t%s\n", x, toBinaryString(x));        // x = OXAB     10을 32bit로 출력
        System.out.printf("y = %#X \t\t%s\n", y, toBinaryString(y));        // y = OXF      -11을 32bit로 출력
        System.out.printf("%#X | %#X = %#X \t%s\n", x, y, x | y, toBinaryString(x | y));    // OXAB | OXF = OXAF    10 15를 32bit로 출력
        System.out.printf("%#X & %#X = %#X \t%s\n", x, y, x&y, toBinaryString(x&y));        // OXAB & OXF = OXB     11을 32bit로 출력
        System.out.printf("%#X ^ %#X = %#X \t%s\n", x, y, x^y, toBinaryString(x^y^y));      // OXAB ^ OXF = OX
        System.out.printf("%#X ^ %#X ^ %#X = %#X %s\n", x, y, y, x^y^y, toBinaryString(x^y^y));
        /*
        %#X는 있는 그대로 변수를 출력
        %s는 32bit 문자열 값을 출력
         */

    }

    static String toBinaryString(int x) {
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }

}           // class 안에 모든 함수가 들어가야 함.