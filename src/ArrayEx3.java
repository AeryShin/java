public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        System.out.println("[변경전]");                        // [변경전]
        System.out.println("arr.length:" + arr.length);       // arr.length:5
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]:" + arr[i]);       // arr[0]:1 ... arr[4]:5
        }
        int[] tmp = new int[arr.length*2];                    // 배열 변수 tmp를 arr*2 크기로 생성

        for(int i=0;i<arr.length;i++){
            tmp[i] = arr[i];                                  // arr 배열의 데이터를 tmp로 복사
        }

        arr = tmp;                                            // tmp에 저장된 값을 arr에 저장

        System.out.println("[변경후]");                        // [변경후]
        System.out.println("arr.length:" + arr.length);       // arr.length:10 (5*2)
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]:" + arr[i]);          // arr[0]:1 ... arr[4]:5, arr[5]:0 ... arr[9]:0

        }
        /*
        int형 arr 배열의 값을 println 형식으로 출력하고 싶으면, arr[i] 형태로 사용
        배열명인 arr을 그대로 넣으면 데이터 값이 아닌, 배열의 주소값 (i@~)형태로 출력
         */
    }
}
