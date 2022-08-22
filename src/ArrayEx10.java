// 버블정렬

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for(int i=0;i<numArr.length;i++){
            System.out.print(numArr[i] = (int)(Math.random()*10));      // 0~9까지의 랜덤 숫자 10개 출력
        }
        System.out.println();

        for(int i=0;i<numArr.length-1;i++){
            boolean changed = false;                                    // 자리바꿈이 발생했는지 체크하기 위함

            for(int j=0;j<numArr.length-1-i;j++){
                if(numArr[j] > numArr[j+1]){                            // 옆의 값이 작으면 서로 바꿈
                    int temp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = temp;
                    changed = true;                                     // 자리바꿈이 발생해서 changed=true
                }
            }

            if(!changed)                                                // 자리이동이 발생하지 않았으면 (그대로 false이면) 반복문을 벗어남
                break;

            for(int k=0;k<numArr.length;k++){
                System.out.print(numArr[k]);                            // numArr[] 안의 정렬된 결과 출력
            }
            System.out.println();
        }
    }
}
