public class OperatorEx27 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b\n", b);                     // b=true
        System.out.printf("!b=%b\n", !b);                   // !b=false
        System.out.printf("!!b=%b\n", !!b);                 // !!b=true
        System.out.printf("!!!b=%b\n", !!!b);               // !!!b=false
        System.out.println();                               // 줄바꿈

        System.out.printf("ch=%c\n", ch);                                             // ch=C
        System.out.printf("ch<'a' || ch>'z' = %b\n", ch<'a' || ch>'z');               // ① ch<'a' || ch>'z' = true
        System.out.printf("!('a'<=ch && ch<='z') = %b\n", !('a'<=ch && ch<='z'));     // ② !('a'<=ch && ch<='z') = false
        System.out.printf(" 'a'<=ch && ch<='z' = %b\n", 'a'<=ch && ch<='z');          // ③ 'a'<=ch && ch<='z' = false

        /*
        ① ch가 소문자 a보다 작거나, z보다 크면 true (대문자는 유니코드가 더 작으므로, true)
        ② ch가 a보다 작고, ch가 z보다 크면 true (대문자는 a보다 작지만, z보다 크지 않으므로 false)
        ③ ch가 a보다 크고, ch가 z보다 작으면 true (대문자가 a보다 크지 않으므로 false)
         */
    }
}
