public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        /*
        byte c = a + b;
        System.out.println(c);       // error (프로그램에 영향이 가므로 주석처리)
        */

        /*
        + 연산자는 byte형을 int형으로 자동변환해서 처리해줌
        => a+b의 값은 int형이 되는데, 이를 더 작은 타입인 byte에 저장하려고 해서 error 발생
         */
    }
}
