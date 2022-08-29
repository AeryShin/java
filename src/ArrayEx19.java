public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {                                       // 5행 3열인 2차원 score 배열 저장
                  {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호  국어  영어  수학  총점  평균");   // 번호   국어  영어  수학  총점  평균
        System.out.println("==============================="); // ==============================

        for(int i=0;i< score.length;i++){                      // 중첩 for문 시작
            int sum = 0;
            float avg = 0.0f;                                  // 평균은 소수점 형태로 나올 수 있으므로, flaot형태로 선언하고 뒤에 접미사 f를 붙여줌

            korTotal += score[i][0];                           // korTotal은 100, 20, 30, 40, 50을 가리킴 (i행 0열)
            engTotal += score[i][1];                           // i행 1열
            mathTotal += score[i][2];                          // i행 2열
            System.out.printf("%3d", i+1);                     // 

            for(int j=0;j<score[i].length;j++){
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }

            avg = sum / (float)score[i].length;
            System.out.printf("%5d %5.1f\n", sum, avg);
        }

        System.out.println("=================================");
        System.out.printf("총점 : %3d %4d %4d\n", korTotal, engTotal, mathTotal);


    }
}
