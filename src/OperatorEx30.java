class OperatorEx30{
    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }

    public static void main(String[] args) {
        int dec = 8;
        System.out.printf("%d >> %d = %4d \t%s ", dec, 0, dec>>0, toBinaryString(dec>>0));      // 8 >> 0 = 8  32비트 표현
        System.out.printf("%d >> %d = %4d \t%s\n", dec, 1, dec>>1, toBinaryString(dec>>1));     // 8 >> 1 = 4  32비트 표현
        System.out.printf("%d >> %d = %4d \t%s\n", dec, 2, dec>>2, toBinaryString(dec>>2));     // 8 >> 2 = 2  32비트 표현
        System.out.printf("%d << %d = %4d \t%s\n", dec, 0, dec<<0, toBinaryString(dec<<0));     // 8 << 0 = 8  32비트 표현
        System.out.printf("%d << %d = %4d \t%s\n", dec, 1, dec<<1, toBinaryString(dec<<1));     // 8 << 1 = 16 32비트 표현
        System.out.printf("%d << %d = %4d \t%s\n", dec, 2, dec<<2, toBinaryString(dec<<2));     // 8 << 2 = 32 32비트 표현
        System.out.println();

        dec = -8;
        System.out.printf("%d >> %d = %4d \t%s\n", dec, 0, dec>>0, toBinaryString(dec>>0));     // -8 >> 0 = -8 32비트 표현
        System.out.printf("%d >> %d = %4d \t%s\n", dec, 1, dec>>1, toBinaryString(dec>>1));     // -8 >> 1 = -4 32비트 표현
        System.out.printf("%d >> %d = %4d \t%s\n", dec, 2, dec>>2, toBinaryString(dec>>2));     // -8 >> 2 = -2 32비트 표현
        System.out.printf("%d << %d = %4d \t%s\n", dec, 0, dec<<0, toBinaryString(dec<<0));     // -8 << 0 = -8 32비트 표현
        System.out.printf("%d << %d = %4d \t%s\n", dec, 1, dec<<1, toBinaryString(dec<<1));     // -8 << 1 = -16 32비트 표현
        System.out.printf("%d << %d = %4d \t%s\n", dec, 2, dec<<2, toBinaryString(dec<<2));     // -8 << 2 = -32 32비트 표현
        System.out.println();

        dec = 8;
        System.out.printf("%d >> %2d = %4d \t%s\n", dec, 0, dec>>0, toBinaryString(dec>>0));    // 8 >>  0 =    8 32비트 표현
        System.out.printf("%d >> %2d = %4d \t%s\n", dec, 32, dec>>32, toBinaryString(dec>>32)); // 8 >> 32 =    8 32비트 표현
        /*
        8 >> 0도 8이지만, 8 >> 32 또한 8이 출력
         */
    }
}
