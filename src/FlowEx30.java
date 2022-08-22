public class FlowEx30 {
    public static void main(String[] args) {
        int sum=0, i = 0;

        while(true){                                // 참일동안 반복
            if(sum > 100)                           // sum이 100보다 클때 멈추고, i를 증가해 sum에 저장
                break;
            ++i;                                    // break문이 실행되면 해당 코드와 아래 코드는 실행이 안되고 while문을 벗어남
            sum += i;
        }

        System.out.println("i=" + i);              // ①
        System.out.println("sum=" + sum);
        /*
        i=0, sum=1
        i=1, sum=3
        i=2, sum=6
        i=3, sum=10
        i=4, sum=15
        i=5, sum=21
        i=6, sum=28
        i=7, sum=36
        i=8, sum=45
        i=9, sum=55
        i=10, sum=66
        i=11, sum=78
        i=12, sum=91
        i=13, sum=105 (i=13에서, ++i로 인해 14로 증가함)
        ∴ i=14, sum=105 출력

         */
    }
}
