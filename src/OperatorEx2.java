public class OperatorEx2 {
    public static void main(String[] args) {
        int i=5, j=0;                          // i=5 j=0

        j = i++;                               // i=6 j=5
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);    // ①


        i=5;
        j=0;                                   // i=5 j=0

        j = ++i;                               // i=6 j=6
        System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);     // ②

        /*
        ① j=i++; 실행 후, i=6, j=5
        => i++는 후위연산자로 i가 1 증가, 하지만, 후위연산자이기때문에 j는 증가 전 값인 5가 대입됨

        ② j=++i; 실행 후, i=6, j=6
        => ++i는 전위연산자로 i가 1 증가해 6이 됨과 동시에 j에도 대입되어 j도 증가한 값인 6이 대입됨

         */
    }
}
