// 해당 값이 몇번 출력됐는지 알 수 있는 예제

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i=0;i<numArr.length;i++){
            numArr[i] = (int)(Math.random()*10);            // numArr 배열에 0~9까지의 랜덤 숫자 10개 저장
            System.out.print(numArr[i]);
        }
        System.out.println();

        for(int i=0;i<numArr.length;i++){
            counter[numArr[i]]++;                          // numArr[0]=4라면, counter[4]=1로 증가 ... 반복
        }

        for(int i=0;i<numArr.length;i++){
            System.out.println(i + "의 개수 : " + counter[i]);     // 0의 개수 : ... ~ 9의 개수 :
        }
    }
}
