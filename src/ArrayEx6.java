// 최대값과 최솟값을 구하는 코드

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for(int i=1;i<score.length;i++){
            if(score[i]>max){                   // score[i]가 max보다 크다면, 해당 값을 max에 대입
                max = score[i];
            } else if(score[i]<min){            // score[i]가 min보다 작다면, 해당 값을 min에 대입
                min = score[i];
            }
        }
        System.out.println("최대값 : " + max);   // 최대값 : 100
        System.out.println("최소값 : " + min);   // 최소값 : 33

    }
}
