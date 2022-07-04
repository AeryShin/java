public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;    // x의 값을 변수 tmp에 저장
        x = y;      // y의 값을 x에 저장 (x = 10에서 x = 20으로 변경)
        y = tmp;    // tmp에 있던 x의 값 10이 y에 저장

        System.out.println("x:" + x + " y:" + y + " tmp:" + tmp);


    }
}
