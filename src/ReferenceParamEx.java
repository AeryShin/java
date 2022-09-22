// class Data { int x; }

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);          // main() : x = 10

        change(d);                                          // change() : x = 1000
        System.out.println("After change(d)");              // After change(d)
        System.out.println("main() : x = " + d.x);          // main() : x = 1000
    }

    static void change(Data d){                             // change 함수가 끝나도, 참조형 매개변수인 Data d를 매개변수로 가져왔기 때문에, main 함수의 d.x의 값이 바뀜
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
