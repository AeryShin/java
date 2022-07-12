public class OperatorEx3 {
    public static void main(String[] args) {
        int i=5, j=5;
        System.out.println(i++);                        // i=6 j=5
        System.out.println(++j);                        // i=6 j=6
        System.out.println("i = " + i + ", j = " + j);    // i = 6, j = 6

        int x=5;
        x = x++ - ++x;
        System.out.println(x);                          // x=-2

        /*
        x=5로 선언한 다음, x = x++ - ++x를 계산하면, 연산 우선순위에 의해
        ① x = x++ - ++x
        ② x = 5   - ++x (후위연산자인 x++이기에, x++ 값은 증가된 값이 아닌 그 전의 값인 5로 출력됨)
        ③ x = 5   - 7 (후위연산자로 인해 x=6이었다가, ++x를 만나 7이 됨)
        ④ x = -2
        ※ 하지만, 식에 두 번 이상 포함된 같은 변수에 증감연산자를 사용하는 것은 피하자.
         */
    }
}
