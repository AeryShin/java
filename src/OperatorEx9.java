public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;
        System.out.println("a=" + a);   // 쓰레기값
        System.out.println("b=" + b);   // b=1000000000000 (정상출력)

        /*
        long 타입에는 항상 뒤에 L을 붙여야 함.
        정수형의 경우 항상 int 타입으로 계산되어 저장되는 타입 또한 int타입이기 때문에 long 타입은 변수타입과 같게 뒤에 접미사 L을 붙여야 함
        앞의 1_000_000이나 뒤 1_000_000 둘 중에 하나만 붙여도 상관 x
        접미사를 붙여야 하는 타입 : long(L), float (f)
         */
    }
}
