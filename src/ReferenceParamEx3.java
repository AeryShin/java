public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 1, 6, 5, 4};

        printArr(arr);                                      // [3,2,1,6,5,4,]
        sortArr(arr);                                       // 정렬됨
        printArr(arr);                                      // [1,2,3,4,5,6,], 정렬된 값 출력
        System.out.println("sum=" + sumArr(arr));           // sum=21
    }

    static void printArr(int[] arr){
        System.out.print("[");
        for(int i : arr){
            System.out.print(i + ",");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr){
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr){                         // 정렬 메서드
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){                      // j가 뒤에있는 j보다 클때 정렬 실행 (= j가 뒤에있는 j보다 작아야 함)
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}
