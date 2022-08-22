// 총합과 평균을 구하는 코드

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};          // 크기가 5인 score 배열 생성

        for(int i=0;i<score.length;i++){
            sum += score[i];                            // score 배열의 값을 모두 더해 sum에 저장
        }
        average = sum / (float)score.length;            // average는 sum/score배열 길이 (int/int는 int로 결과가 나오므로, (float)의 명시적 형변환을 통해 계산결과를 float로 얻음)

        System.out.println("총점 : " + sum);             // 총점 : 478
        System.out.println("평균 : " + average);         // 평균 : 95.6 (478/5)
    }
}
