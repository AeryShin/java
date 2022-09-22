public class CallStackTest {
    public static void main(String[] args) {
        firstMethod();                                  // firstMethod 메서드 호출
    }

    static void firstMethod(){
        secondMethod();                                 // secondMethod 메서드 호출
    }

    static void secondMethod(){
        System.out.println("secondMethod()");           // secnodMethod()
    }

}
