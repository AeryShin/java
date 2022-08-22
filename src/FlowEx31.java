public class FlowEx31 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i%3 == 0)                            // i가 3의 배수면 continue문을 만나 뒤 문장을 실행하지 않고
                // 다시 for문으로 돌아감
               continue;
            System.out.println(i);                  // 증감식인 i++에 의해 1부터 출력 (1 2 4 5 7 8 10)
        }
    }
}
