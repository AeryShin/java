import java.util.logging.SocketHandler;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 8.0;

        System.out.println(name);       // Java 출력
        System.out.println(str);        // Java8.0 출력
        System.out.println(7 + " ");    // "7 " => 7 출력
        System.out.println(" "+ 7);     // " 7" =>  7 출력
        System.out.println(7 + "");     // "7" => 7 출력
        System.out.println("" + 7);     // "7" => 7 출력
        System.out.println("" + "");    // 공백 출력
        System.out.println(7 + 7 + ""); // "14" => 14 출력
        System.out.println("" + 7 + 7); // "7" + 7가 되서, 77 출력
        

    }
}

