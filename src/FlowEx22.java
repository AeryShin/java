import org.w3c.dom.ls.LSOutput;

public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);           // 10 20 30 40 50 출력
            System.out.println();                       // 줄바꿈
        }
        for (int tmp : arr) {                           // tmp 변수에 arr 배열 저장
            System.out.printf("%d ", tmp);              // tmp에 들어있는 값인 10 20 30 40 50 출력
            sum += tmp;                                 // sum = sum+i로, 10+20+30+40+50인 150을 sum에 저장
        }
        System.out.println();                           // 줄바꿈
        System.out.println("sum=" + sum);               // sum=150 출력
    }

}
