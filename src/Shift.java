public class Shift {
    public static void main(String[] args) {
        int a = 10;          int b = -10;        int c = 0;
        System.out.println("10  = " + Integer.toBinaryString(a));
        System.out.println("-10 = " + Integer.toBinaryString(b));

        //signed shift
        c = a >> 1;
        System.out.println("10 >> 1  = " + Integer.toBinaryString(c));

        //unsigned shift
        c = a >>> 1;
        System.out.println("10 >>> 1 = " + Integer.toBinaryString(c) );

        c = b >> 1;
        System.out.println("-10 >> 1  = " + Integer.toBinaryString(c) );

        c = b >>> 1;
        System.out.println("-10 >>> 1 = " + Integer.toBinaryString(c));
    }
}
