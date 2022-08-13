/* 쉬프트 연산자와 비트(AND) 연산자를 통해 16진수를 끝에서부터 한자리씩 뽑아내는 예제*/

public class OperatorEx31 {
    public static void main(String[] args) {
        int dec = 1234;
        int hex = 0xABCD;           // A:10(1010), B:11(1011), C:12(1100), D:13(1101)
        int mask = 0xF;             //                                     F:15(1111)

        System.out.printf("hex=%X\n", hex);     // hex=ABCD
        System.out.printf("%X\n", hex & mask);  // D (1101 & 1111 = 1101인 13, D)

        hex = hex >> 4;
        System.out.printf("%X\n", hex & mask);  // C

        hex = hex >> 4;
        System.out.printf("%x\n", hex & mask);  // B

        hex = hex >> 4;
        System.out.printf("%X\n", hex & mask);  // A
    }
}
