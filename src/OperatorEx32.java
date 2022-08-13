public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x>=0 ? x:-x;
        absY = y>=0 ? y:-y;                            // 절댓값 출력 (참이어도 양수, 거짓이어도 양수)
        absZ = z>=0 ? z:-z;

        signX = x>0 ? '+':(x==0 ? ' ':'-');
        signY = y>0 ? '+':(y==0 ? ' ':'-');
        signZ = z>0 ? '+':(z==0 ? ' ':'-');

        System.out.printf("x=%c%d\n", signX, absX);     // x=+10
        System.out.printf("y=%c%d\n", signY, absY);     // y=-5
        System.out.printf("z=%c%d\n", signZ, absZ);     // z= 0

    }
}
