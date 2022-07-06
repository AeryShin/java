public class CastingEx2 {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte) i;          // int형 i를 byte형으로 캐스팅
        System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);    // [int -> byte] i=10 -> b=10 (변함 x)

        i = 300;
        b = (byte) i;
        System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);    // [int -> byte] i=300 -> b=44

        b = 10;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d\n", b, i);    // [byte -> int] b=10 -> i=10 (변함 x)

        b = -2;
        i = (int)b;
        System.out.printf("[byte -> int] b=%d -> i=%d\n", b, i);    // [byte -> int] b=-2 -> i=-2

        System.out.printf("i=" + Integer.toBinaryString(i));        // i=1111111111...0

        /* Integer.toBinaryString은 10진 정수를 2진 정수로 캐스팅하는 것으로, i의 값인 -2가 2진 정수화되서 출력됨
        111111..0을 2의 보수법으로 바꾸면
        ① 11111.. 0을 1의보수 (반대로 뒤집기)
        ② 0000.. 1에 2의보수 취하기 (+1 하기)
        ③ 0000.. 1 + 1 = 0000..10 = 2인데, 처음 부호비트가 1이었기때문에 음수인 -2를 의미
         */

    }
}
