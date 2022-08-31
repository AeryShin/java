/*
class Tv {                                          // 속성(멤버변수) 선언
    String color;
    boolean power;                                  // power은 on, off 둘 중 하나이므로 boolean타입으로 선언
    int channel;

    void power() {power = !power;}                  // 기능(메서드) 선언, 항상 반대값으로 변경하는 기능
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
*/

public class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];                 // 길이가 3인 Tv객체 배열 생성

        for(int i=0;i<tvArr.length;i++){        // Tv 객체 생성해서 각 요소에 저장
            tvArr[i] = new Tv();
            tvArr[i].channel = i+10;            // 10, 11, 12 저장
        }

        for(int i=0;i<tvArr.length;i++){
            tvArr[i].channelUp();               // 11, 12, 13 저장
            System.out.printf("tvArr[%d].channel = %d\n", i, tvArr[i].channel);     // tvArr[0] = 11, tvArr[1] = 12, tvArr[3] = 13
        }
    }
}
