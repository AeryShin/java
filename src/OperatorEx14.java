public class OperatorEx14 {
    public static void main(String[] args) {
        char c = 'a';
        for(int i=0; i<26; i++){
            System.out.print(c++);      // a부터 26개 문자 출력 (a~z)
        }
        System.out.println();           // 줄바꿈

        c = 'A';
        for(int i=0; i<26; i++){
            System.out.print(c++);      // A부터 26개 문자 출력 (A~Z)
        }
        System.out.println();           // 줄바꿈

        c='0';
        for(int i=0; i<10; i++){
            System.out.print(c++);      // 0부터 10개 숫자 출력 (0~9)
        }
        System.out.println();           // 줄바꿈

        /*
        소문자 a의 유니코드는 65, 대문자 A의 유니코드는 97로 32차이임을 알 수 있음.
         */
    }

}
