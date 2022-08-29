class Tv {                                          // 속성(멤버변수) 선언
    String color;
    boolean power;                                  // power은 on, off 둘 중 하나이므로 boolean타입으로 선언
    int channel;

    void power() {power = !power;}                  // 기능(메서드) 선언, 항상 반대값으로 변경하는 기능
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class TvTest {
    public static void main(String[] args) {
        Tv t;                                       // Tv 인스턴스를 참조하기 위한 변수 t 선언
        t = new Tv();                               // Tv 인스턴스 생성
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + "입니다. ");        // channelDown 메서드에 의해, 현재 채널은 6입니다. 출력
    }
}