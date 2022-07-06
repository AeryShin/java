public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';              // 문자형 변수 ch에 A 저장
        int code = (int)ch;         // ch에 있는 문자 A를 정수로 형변환해 code 변수에 저장

        System.out.printf("%c=%d(%#X)\n", ch, code, code);  //A=65(65 16진수)

        char hch = '가';             // hch 변수에 가 저장
        System.out.printf("%c=%c(%X)\n", hch, (int)hch, (int)hch);
        // 가=가의유니코드(가의 16진수)
        /*
        %X만 쓰면 16진수로 표현하는 것
        %#X처럼 %x 사이에 #가 들어가있으면, 16진수라는 접미사 OX가 붙음
        %#x같이 x가 소문자로 쓰이면, OX가 아닌 Ox로 표현 (x의 크기 차이)
        %X은 AC00 출력 / %x은 ac00 출력 (대문자, 소문자 차이)
         */
    }
}
