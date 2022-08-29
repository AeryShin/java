public class MultiArrEx3 {
    public static void main(String[] args) {
        int[][] m1 = {                              // 2행 3열 m1
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] m2 = {                              // 3행 2열 m2
                {1, 2},
                {3, 4},
                {5, 6}
        };

        final int ROW = m1.length;                  // m1의 행길이 (2)
        final int COL = m2[0].length;               // m2의 열길이 (2)
        final int M2_ROW = m2.length;               // m2의 행길이 (3)

        int[][] m3 = new int[ROW][COL];             // 2행 2열 m3

        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){
                for(int k=0;k<M2_ROW;k++){
                    m3[i][j] += m1[i][k] * m2[k][j];        // 행렬곱 m1*m2를 m3에 저장
                }
            }
        }

        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){
                System.out.printf("%3d ", m3[i][j]);
            }
            System.out.println();
        }
    }
}
/*
행렬곱이 성립하려면 m1의 열의 길이 = m2의 행의 길이여야 함
2행 3열 = 3행 2열이므로 행렬곱 성립 => 결과는 2행 2열 출력
m1*m2의 행렬곱을 저장하는 m3 코드 알고리즘
for(i, j) 2중 중첩 for문을 이용할 경우,
m3[i][j] = m1[i][0] * m2[0][j]
           m1[i][1] * m2[1][j]
           m1[i][2] * m2[2][j] 이므로, for문을 k를 넣어서 다시 짜면

for(i, j, k) 3중 중첩 for문을 이용하면,
m3[i][j] = m1[i][k] * m2[k][j]로 바꿀 수 있음
 */