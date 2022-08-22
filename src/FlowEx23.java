public class FlowEx23 {
    public static void main(String[] args) {
        int i = 5;

        while(i--!=0){                                          // i가 0이 아닐때만 참, 0이면 while 문을 벗어남
            System.out.println(i + " - I can do it.");          // 4 - I can do it. ... 0 I can do it.
        }
    }
}
