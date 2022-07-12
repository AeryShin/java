public class OperatorEx1 {
    public static void main(String[] args) {
        int i=5;
        i++;                        // 후위연산자 증가 -> i=6
        System.out.println(i);      // 6

        i=5;
        ++i;                        // 전위연산자 증가 -> i=6
        System.out.println(i);      // 6
    }
}
