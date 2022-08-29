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

class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();                                                       // Tv t1; t1 = new Tv();의 두문장을 한문장으로 합침
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");         // t1의 channel값은 0입니다.
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");         // t2의 channel값은 0입니다. (초기화 전)

        t1.channel = 7;
        System.out.println("t1의 channel값을 7으로 변경하였습니다.");               // t1의 channel값을 7으로 변경하였습니다.

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");         // t1의 channel값은 7입니다.
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");         // t2의 channel값은 0입니다.

    }
}