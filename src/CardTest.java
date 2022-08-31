class Card {                        // 속성(멤버변수)
  String kind;                      // 인스턴스 변수 (독립적인 값을 가지고 있는 변수)
  int number;
  static int width = 100;           // 클래스 변수 (공통적인 값을 가지고 있는 공유변수로, static이라는 키워드를 가지고 있음)
  static int height = 250;
};


public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);           // Card.width = 100
        System.out.println("Card.height = " + Card.height);         // Card.height = 250

        Card c1 = new Card();               // Card 객체인 c1 생성
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();               // Card 객체인 c2 생성
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        // c1은 Heart, 7이며, 크기는 (100, 250)
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
        // c2는 Spade, 4이며, 크기는 (100, 250)
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");        // c1의 width와 height를 각각 50, 80으로 변경합니다 (width와 height는 공유변수이므로, c2 또한 변경됨)
        c1.width = 50;                      // 공유변수인 클래스변수는 자동완성 기능이 없음 (클래스명을 사용했을 때는 자동완성 기능 존재)
        c1.height = 80;                     // 변경할 때는 객체명인 Card.height = 하고 변경하는 것을 권장 (변수명으로 하면, 인스턴스로 오해하기 쉽기 때문)

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        // c1은 Heart, 7이며, 크기는 (50, 80)
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
        // c2는 Spade, 4이며, 크기는 (50, 80)
    }
}
