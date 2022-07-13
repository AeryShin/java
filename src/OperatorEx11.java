public class OperatorEx11 {
    public static void main(String[] args) {
        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d\n", d, a, d-a);                 // 'd' - 'a' = 3
        System.out.printf("'%c' - '%c' = %d\n", two, zero, two-zero);       // '2' - '0' = 2
        System.out.printf("'%c'=%d\n", a, (int)a);                          // 'a'=97 (char a를 int로 변환)
        System.out.printf("'%c'=%d\n", d, (int)d);                          // 'd'=100 (char d를 int로 변환)
        System.out.printf("'%c'=%d\n", zero, (int)zero);                    // '0'=48 (char 0을 int로 변환)
        System.out.printf("'%c'=%d\n", two, (int)two);                      // '2'=50 (char 2를 int로 변환)
    /*
    char 문자를 int형으로 변환하면, 그에 해당하는 유니코드 값이 대입되어 계산됨
     */
    }
}
