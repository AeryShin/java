public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음.");      // " main(String[] args)이 시작되었음.
        firstMethod();                                             // firstMethod()이 시작되었음. secondMethod()이 시작되었음.
                                                                   // secondMethod()이 끝났음. firstMethod()이 끝났음.
        System.out.println("main(String[] args)이 끝났음.");         // main(String[] args)이 끝났음 " 출력
    }

    static void firstMethod(){
        System.out.println("firstMethod()이 시작되었음.");
        secondMethod();
        System.out.println("firstMethod()이 끝났음.");
    }

    static void secondMethod(){
        System.out.println("secondMethod()이 시작되었음.");
        System.out.println("secondMethod()이 끝났음.");
    }
}
