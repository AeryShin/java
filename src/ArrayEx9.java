import java.util.*;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++){
            int tmp = (int)(Math.random() * code.length);       // tmp code배열 데이터 안의 랜덤 숫자 저장
            arr[i] = code[tmp];                                 // 랜덤숫자를 크기가 10인 arr[i]에 저장
        }

        System.out.println(Arrays.toString(arr));               // 랜덤숫자 10개 (-4, -1, 3, 6, 11중 하나) 출력
    }
}
