import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toOctalString(n));
        System.out.println(Integer.toHexString(n));
        System.out.println(n == (byte) n ? "YES" : "NO");
        System.out.println(n == (short) n ? "YES" : "NO");
    }
}
