public class OperatorEx23 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b\n", "abc"=="abc");                // abc == abc ? true
        System.out.printf(" str1 == \"abc\" ? %b\n", str1=="abc");                   // str1 == abc ? true
        System.out.printf(" str2 == \"abc\" ? %b\n", str2=="abc");                   // ① str2 == abc ? false
        System.out.printf("str1.equals(\"abc\") ? %b\n", str1.equals("abc"));        // str1.equals("abc") ? true
        System.out.printf("str2.equals(\"abc\") ? %b\n", str2.equals("abc"));        // ② str2.equals("abc") ? true
        System.out.printf("str2.equals(\"ABC\") ? %b\n", str2.equals("ABC"));        // ③ str2.equals("ABC") ? false
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b\n", str2.equalsIgnoreCase("ABC"));  // ④
        // str2.equalsIgnoreCase("ABC") ? true

    /*
    "문자"를 출력하려면, \"문자\"를 입력해야 함
    ① str2=="abc" false 출력 이유 : 내용은 같아도, 다른 객체이기 때문
    ② 다른 객체여도 내용이 같음을 확인하고 싶으면, equals() 메서드 사용 => 문자열 비교할때는 항상 equals를 사용하자.
    ③ Java에서는 대소문자를 구분하기 때문에, abc와 ABC는 다른 내용으로 간주해 false 출력
    ④ 대소문자를 구분하지 않고 내용이 같음을 확인하고 싶으면, equalsIgnoreCase 메서드를 사용
     */
    }
}
