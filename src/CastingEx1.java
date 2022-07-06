public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d;                         // 캐스팅

        System.out.println("score=" + score);       // score=85
        System.out.println("d=" + d);               // d=85.4
    }
}

// 형변환 (캐스팅)할 때, (int)d라고 해도 되지만, (int) d 라고 중간에 공백을 넣어도 출력 결과는 동일함을 확인