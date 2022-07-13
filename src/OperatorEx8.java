public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;          // 출력은 _를 제외한 1000000만 출력됨 (_는 구분하기 쉬운 용도로 사용)
        int b = 2_000_000;

        long c = a*b;
        System.out.println(a);
        System.out.println(c);      // 원하는 값 출력 x
        /*
        원하는 값은, 1_000_000 x 2_000_000인 2_000_000_000_000이지만, 다른 값이 출력됨
        a와 b는 모두 int형이며, *에 의해 int형으로 이미 계산된 후, long타입에 저장되기 때문에 변수를 저장할 때 늘려봤자 소용이 없음

         */
    }
}
