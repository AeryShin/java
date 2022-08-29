public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-", "-..", ".",
                          "..-.", "--.", "....", "..", ".---",
                          "-.-", ".-..", "--", "-.", "---",
                          "..-", "...-", ".--", "-..-", "-.--",
                          "--.."};


        String result = "";

        for(int i=0;i<source.length();i++){
            result += morse[source.charAt(i)-'A'];          // ex) source.charAt(0) : S(83)일 때, 83-65 = morse(18), 18번째 배열인 ...출력
        }

        System.out.println("source:" + source);             // source:SOSHELP
        System.out.println("morse:" + result);              // morse:morse부호 출력

    }
}
