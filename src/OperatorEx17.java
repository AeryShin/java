public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;       // ① double은 접미사 붙일 필요 x

        System.out.println(shortPi);         //

        /*
        ① (int)(pi * 1000 + 0.5) / 1000.0;
           1. 3141.592 = 0.5 = 3142.092
           2. int 적용해서 3142
           3. 3142 / 1000.0 = 3.142
         */
    }
}
