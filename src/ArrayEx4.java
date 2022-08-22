public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};                                         // 길이가 4인 abc 배열 생성
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};           // 길이가 10인 num 배열 생성
        System.out.println(abc);                                                   // ABCD 출력
        System.out.println(num);                                                   // 0123456789 출력

        char[] result = new char[abc.length + num.length];                           // result 배열은 abc배열 크기인 4 + num배열 크기인 10을 더한 값인 14 크기로 만들어짐
        System.arraycopy(abc, 0, result, 0, abc.length);             // abc[0]에서 result[0]로 abc길이인 4만큼 복사 (result[] = {ABCD} )
        System.arraycopy(num, 0, result, abc.length, num.length);           // num[0]에서 result[abc길이인 4]로 num 전체 복사 (result[] = {ABCD0123456789} - 뒤에 덧붙여짐)
        System.out.println(result);                                               // ABCD0123456789

        System.arraycopy(abc, 0, num, 0, abc.length);               // abc[0]에서 num[0]으로 abc 길이인 4만큼 복사 (num[] = {ABCD} )
        System.out.println(num);                                                  // ABCD456789 (abc 배열 길이를 제외한 나머지는 num 배열의 데이터 요소 그대로 출력)

        System.arraycopy(abc, 0, num, 6, 3);                  // abc[0]에서 num[6]으로 길이 3만큼 복사 (그 전 : ABCD456789에서, num[6]이 가리키는 6부터 다시 abc로 채워짐)
        System.out.println(num);                                                  // ABCD45ABC9 (num[6]인 6부터 지워지고, 3개크기만큼 다시 복사해 ABC를 채우고 마지막 9 출력)

    }
}

/*
그러므로, 배열 복사하는 방법은 두가지로 나눌 수 있다.
① for문 이용
② System.arraycopy 메서드 이용
 */
