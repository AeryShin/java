import java.util.Scanner;

public class MultiArrEx1 {
    public static void main(String[] args) {
        final int SIZE = 10;                        // SIZE = 10
        int x=0, y=0;

        char[][] board = new char[SIZE][SIZE];      // 입력한 좌표 표시 (10행 10열)
        byte[][] shipBoard = {                      // 배의 위치 저장 (0:바다, 1:배)
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 0}
        };

        for(int i=1;i<SIZE;i++){
            board[0][i] = board[i][0] = (char)(i+'0');      // board는 char 배열이기 때문에, 숫자를 문자로 변환해 저장해야 함 (char)(1+'0') = '1'
        }

        Scanner scanner = new Scanner(System.in);

        while(true){                                                        // 참일동안 반복
            System.out.printf("좌표를 입력하세요.(종료는 00)>");                // 좌표를 입력하세요.(종료는 00)>
            String input = scanner.nextLine();

            if(input.length()==2){                                         // 두 글자를 입력한 경우
                x = input.charAt(0)-'0';                                   // 문자를 숫자로 변환
                y = input.charAt(1)-'0';

                if(x==0 && y==0)                                            // x랑 y 모두 0이면 빠져나감 (00이면)
                    break;
            }

            if(input.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE){    // 입력된 길이가 2가 아니거나, x가 0보다 작고 같거나,  x가 SIZE보다 같고 크거나, y가 0보다 작고 같거나, y가 SIZE보다 크고 같으면
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");      // 잘못된 입력입니다. 다시 입력해주세요. 출력
                continue;
            }

            board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';               // 무한반복문, 좌표 x와 y에 저장된 값이 1이면 O 저장, 1이 아니면 X 저장
                                                                            // board와 shipboard 좌표는 가로 세로가 모두 1씩 차이나기 때문에 [x-1][y-1]
            for(int i=0;i<SIZE;i++){
                System.out.println(board[i]);                               // board가 2차원 배열의 각 요소가 1차원 배열 + char 변수라 바로 출력 가능, 다른 변수였으면 i와 j를 사용해 이중for문을 돌려서 출력해야 함
            }
            System.out.println();
        }
    }
}
