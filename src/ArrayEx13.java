// 16진수 -> 2진수 변환 예제

public class ArrayEx13 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'};                  // 16진수

        String[] binary = {"0000", "0001", "0010", "0011",  // 2진수수
                          "0100", "0101", "0110", "0111",
                           "1000", "1001", "1010", "1011",
                           "1100", "1101", "1110", "1111"};

        String result ="";

        for(int i=0;i<hex.length;i++){
            if(hex[i]>='0' && hex[i]<='9'){         // hex[i]가 0~9 범위라면
                result += binary[hex[i]-'0'];       // result = result + binary[hex[i]-'0']
            } else{                                 // A~F면,
                result += binary[hex[i]-'A'+10];    // result = result + binary[hex[i]-'A'+10]
            }
        }

        /*
        ex) hex[0]=C
        C-A+10 = 12 (12-10+10)
        binary[12] = 1100
         */
        System.out.println("hex:" + new String(hex));   // hex:CAFE
        System.out.println("binary:" + result);         // binary:1100101011111110(12 10 15 14를 2진수로 나열)

    }
}
