/* ********** 소문자->대문자 변환 프로그램 ********** */

public class OperatorEx15 {
    public static void main(String[] args) {
    char lowerCase = 'a';
    char upperCase = (char)(lowerCase-32);
        System.out.println(upperCase);          // A

        /*
        유니코드로 a=97, A=65로, 둘의 차이는 32
        ∴ 소문자 a인 lowerCase에서 32를 빼면 대문자 A 출력
         */
    }
}
