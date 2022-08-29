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


public class Tvtest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");     // t1의 channel값은 0입니다.
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");     // t2의 channel값은 0입니다.

        t2 = t1;                                                            // t1이 저장하고 있는 값(주소)를 t2에 저장 => t2도 t1의 인스턴스를 따라감
        t1.channel = 7;                                                     // (7, 7)
        System.out.println("t1의 channel 값을 7로 변경했습니다.");              // t1의 channel 값을 7로 변경했습니다.

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");     // t1의 channel값은 7입니다.
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");     // t2의 channel값은 7입니다.
    }
}
