public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;    // _는 구분자로, 출력에서는 제외됨. long의 접미사 L도 출력에서 제외
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d\n", b);                // b=1
        System.out.printf("s=%d\n", s);                // s=2
        System.out.printf("c=%c, %d \n", c, (int)c);   // c=A, 65
        System.out.printf("finger=[%5d]\n", finger);   // finger=[   10] => 5자리 마지막에 10
        System.out.printf("finger=[%-5d]\n", finger);  // finger=[10   ] => 5자리 처음에 10
        System.out.printf("finger=[%05d]\n", finger);  // finger=[00010] => 5자리 마지막에 10, 공백은 0으로 채움
        System.out.printf("big=%d\n", big);            // big=100000000000
        System.out.printf("hex=%#x\n", hex);           // hex=0xffffffffffffffff
        System.out.printf("octNum=%o, %d\n", octNum, octNum);    // octNum=10, 8 (%o가 8진수를 의미)
        System.out.printf("hexNum=%#x, %d\n", hexNum, hexNum);
        // hexNum=10, 16 (%x가 16진수를 의미, #는 8진수의 경우 앞에 0, 16진수의 경우 앞에 0x가 붙어서 출력됨)
        System.out.printf("binNum=%s, %d\n", Integer.toBinaryString(binNum), binNum);  // binNum=10, 2 (%s가 2진수를 의미)

        /*
        %s = 2진수
        %o = 8진수
        %x = 16진수
        2진 문자열의 경우, Integer.toBinaryString(변수명)을 해야 2진수로 가리키는 값을 출력함.
        */

    }
}
