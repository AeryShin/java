public class ArrayEx18 {
    public static void main(String[] args) {
        int[][] score = {                       // 4행 3열의 2차원 배열 생성
                  {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
        };
        int sum = 0;

        for(int i=0;i<score.length;i++){                                      // 2차원 배열이므로 for문 중첩이 일어남
            for(int j=0;j<score[i].length;j++){                               // score[i]의 길이만큼 반복
                System.out.printf("score[%d][%d]=%d\n", i, j, score[i][j]);   // score[0][0] = 100 ... score[0][2]=100 ... score[3][2]=40
            }
        }

        for(int[] tmp : score){                 // score의 각 요소를 tmp에 저장
            for(int i : tmp){                   // tmp는 1차원 배열을 가리키는 참조변수
                sum += i;                       // tmp 안의 요소를 모두 더함
            }
        }

        System.out.println("sum=" + sum);
    }
}
