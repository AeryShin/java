import java.util.*;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//      int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a','b', 'c', 'd'};

        for(int i=0;i<iArr1.length;i++){
            iArr1[i] = i+1;                                     // iArr1[1] = 2 (iArr1[10] : 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        }
        for(int i=0;i<iArr1.length;i++){
            iArr2[i] = (int)(Math.random()*10) + 1;             // iArr2[10] = 랜덤
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr1));
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);                              // char 형태가 아닌 int 형태이므로, println에는 데이터값이 아닌 주소값 출력 (i@~)
        System.out.println(chArr);                              // char 형태이므로 데이터값 출력
    }
}
