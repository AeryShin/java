public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};

        for(int i=0;i< names.length;i++){
            System.out.println("names["+i+"]:" + names[i]);     // names[0]:Kim ... names[2]:Yi
        }

        String tmp = names[2];                         // tmp 변수에 Yi 저장
        System.out.println("tmp:" + tmp);              // tmp:Yi
        names[0] = "Yu";

        for(String str : names){                       // 향상된 for문, String 배열 출력 (타입 변수명지정 : 배열명)
            System.out.println(str);                   // Yu    Park    Yi 출력
        }
    }
}
