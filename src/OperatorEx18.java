public class OperatorEx18 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = Math.round(pi * 1000) / 1000.0;        // ① Math.round 메서드 : 소수점 버리지 않고, 반올림
        System.out.println(shortPi);            //

        /*
        ① Math.round(pi * 1000) / 1000.0
           1. 3.141592 * 1000 = 3141.592
           2. Math.round 함수는 int형으로 나타내는 것은 동일하지만, 소수점을 버리지 않고 반올림해줌 => 3142
           3. 3142 / 1000.0 = 3.142
         */
    }
}
