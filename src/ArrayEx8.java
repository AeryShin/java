// 로또번호를 생성하는 코드

public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i=0;i<ball.length;i++){
            ball[i] = i+1;                          // ball 배열에 1~45 숫자 저장
        }
        int temp = 0;
        int j = 0;

        for(int i=0;i<6;i++){
            j = (int)(Math.random()*45);            // j에 0~44까지의 랜덤 숫자 저장
            temp = ball[i];                         // ball[i]와 ball[j]를 서로 바꾸는 코드
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for(int i=0;i<6;i++){
            System.out.printf("ball[%d]=%d\n", i, ball[i]);    // 랜덤으로 6개(ball[0]~ball[5])가 출력됨
        }
    }
}
