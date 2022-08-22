public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0;i<numArr.length;i++){
            numArr[i] = i;
            System.out.print(numArr[i]);            // 0123456789
        }
        System.out.println();

        for(int i=0;i<100;i++){
            int n = (int)(Math.random()*10);        // n은 0~9값 중 하나를 임의로 얻음
            // 아래 코드는 순서를 바꾸는 코드
            int tmp = numArr[0];                    // ① 처음에 있는 0을 tmp에 저장 (처음자리 비어있음)
            numArr[0] = numArr[n];                  // ② n번째 자리를 처음자리에 저장 (n번째 자리 비어있음)
            numArr[n] = tmp;                        // ③ tmp에 있는 값을 n번째 자리에 저장
        }

        for(int i=0;i<numArr.length;i++){
            System.out.print(numArr[i]);            // 실행할때마다 random 메서드에 의해 다른 값 출력
        }
    }
}
