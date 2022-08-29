public class ArrayEx14 {
    public static void main(String[] args) {
        String src = "ABCDE";

        for(int i=0;i<src.length();i++){
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+"):" + ch);          // src.charAt(0):A ... src.charAt(4):E

        }
        char[] chArr = src.toCharArray();           // string src를 char로 변환해 chArr 배열에 저장
        System.out.println(chArr);

    }
}
