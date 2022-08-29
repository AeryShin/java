import java.util.*;

public class MultiArrEx2 {
    public static void main(String[] args) {
        final int SIZE = 5;
        int x = 0, y = 0, num = 0;

        int[][] bingo = new int[SIZE][SIZE];       // 5x5 빙고
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<SIZE;i++)
            for(int j=0;j<SIZE;j++)
                bingo[i][j]=i*SIZE + j + 1;        // 배열의 모든 요소를 1부터 SiZE*SIZE까지의 숫자로 초기화

        for(int i=0;i<SIZE;i++) {                  // 배열에 저장된 값을 뒤섞음
            for(int j=0;j<SIZE;j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);

                int tmp = bingo[i][j];             // bingo[i][j]와 bingo[x][y]를 바꿈
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            for(int i=0;i<SIZE;i++) {
                for (int j = 0; j < SIZE; j++)
                    System.out.printf("%2d ", bingo[i][j]);             // bingo 출력
                System.out.println();
            }
            System.out.println();

            System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE * SIZE);      // 1~25까지의 숫자를 입력하세요. (5x5=25)
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            outer:                                                      // outer이란 이름으로 for문 저장
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if (bingo[i][j] == num) {                       // bingo값이랑 입력한 num값이랑 같으면
                            bingo[i][j] = 0;                            // 해당 칸을 0으로 바꿈
                            break outer;                                // 2중 반복문을 벗어나 다시 do문으로 가서 변경된 값을 출력함
                        }
                    }
                }
        } while (num != 0);                                             // 입력한 값인 num이 0이 아닐때까지 반복 (0이면 종료)
    }
}