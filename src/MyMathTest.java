public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();                               // 객체 생성
        long result1 = mm.add(5L, 3L);                    // long 형이므로, 뒤에 접미사 L이 붙음
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);               // double형 대신 접미사를 사용해 long 값으로 호출하였음. 이 값은 double형으로 자동형변환이 됨

        System.out.println("add(5L, 3L) = " + result1);        // (add(5L, 3L) = 8
        System.out.println("subtract(5L, 3L) = " + result2);   // subtract(5L, 3L) = 2
        System.out.println("multiply(5L, 3L) = " + result3);   // multiply(5L, 3L) = 15
        System.out.println("divide(5L, 3L) = " + result4);     // divide(5L, 3L) = 1.66666666666...
    }
}       // Main 끝


class MyMath {                                                  // MyMath 클래스
    long add(long a, long b){                                   // add 메서드는 매개변수 두 개를 받고, 더한 값을 return
        long result = a+b;
        return result;
    }
    long subtract(long a, long b){return a-b;}                  // subtract 메서드는 매개변수 두 개를 받고, 뺀 값을 return
    long multiply(long a, long b){return a*b;}                  // multiply 메서드는 매개변수 두 개를 받고, 곱한 값을 return
    double divide(double a, double b){return a/b;}              // divide 메서드는 매개변수 두 개를 받고, 나눈 값을 return
}