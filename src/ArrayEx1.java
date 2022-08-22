public class ArrayEx1 {
    public static void main(String[] args) {
        int[] score = new int[5];                   // 크기가 5인 배열 생성
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k+1] = 70;                            // score[2]=70
        score[3] = 80;
        score[4] = 90;

        int tmp = score[k+2] + score[4];            // tmp = score[3] + score[4] = 170

        for(int i=0;i<5;i++){
            System.out.printf("score[%d] : %d\n", i, score[i]);     // score[0] : 50 ... score[4] = 90
        }

        System.out.printf("tmp : %d\n", tmp);               // tmp : 170
        System.out.printf("score[%d]:%d\n", 7, score[7]);   // error. 배열 크기인 score[5]를 초과했기 때문. 크기에 맞춰서 수정해야 함. 최대 score[4]까지 출력 가능
    }
}
