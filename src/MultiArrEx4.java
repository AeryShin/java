import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
    String[][] words = {                    // 3행 2열
            {"chair", "의자"},
            {"computer", "컴퓨터"},
            {"integer", "정수"}
    };

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<words.length;i++){
            System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);                // Q1. chair의 뜻은? ... Q3. integer의 뜻은?

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])){
                System.out.printf("정답입니다. \n\n");                               // 입력한 답이 words[i][1]의 글자와 같으면 정답입니다. 출력
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다. \n\n", words[i][1]);    // 다르면 틀렸습니다. 정답은 ~입니다. 출력
            }
        }
    }
}
