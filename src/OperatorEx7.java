public class OperatorEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a*b);
        System.out.println(c);      // 44 (데이터 손실된 값 출력)
        /*
        error가 나지 않으려면 형변환과 동시에 (byte)를 앞에 붙여써줘야 함.
        (a*b)에서 int로 계산된 값이 byte로 변환되는 것이기 때문에, 에러가 안나는 대신 데이터 손실이 발생
        원래 값인 int=300에서, byte의 정규 크기인 8bit (1byte)만 저장되기 때문에
        300 = 0001 0010 1100에서 뒤 8비트만 살려 (256+32+8+4)
        0010 1100이 byte c 변수에 저장되어, 44가 출력됨 (32+8+4)
         */
    }
}
