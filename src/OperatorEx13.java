public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';
//      char c2 = c1+1;             // error발생
        char c2 = 'a'+1;

        System.out.println(c2);     // b (c2를 char형으로 저장했기 때문)

        /*
        char c2 = c1+1이 error나는 이유
        ① c2값에 바로 결과값이 저장되는 것이 아닌, c1+1이 저장됨
        ② 출력할 때 비로소 c1+1을 출력함 => c1의 값은 다른 코드줄에 있기 때문에 바로 출력이 안되며, error
        => 정상적으로 출력하려면 char c2 = (char)(c1+1)처럼, 형변환을 명시해줘야 함.
         */
    }
}
