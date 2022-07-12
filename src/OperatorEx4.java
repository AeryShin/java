public class OperatorEx4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i;                     // +i는 변화 x
        System.out.println(i);      // -10

        i = -10;
        i = -i;                     // -i는 부호연산자로, 부호를 반대로 바꿈
        System.out.println(i);      // 10
    }
}
