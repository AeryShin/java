public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int)(pi * 1000) / 1000f;    // ①
        System.out.println(shortPi);                 // 3.141

        /*
        ① (int)(pi * 1000) / 1000f
           1. pi * 1000 = 3141.592
           2. int 적용하면 3141
           3. 3141 / 1000 = 3.141
         */
    }
}
