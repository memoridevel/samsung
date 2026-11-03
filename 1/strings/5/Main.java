import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(
                s.substring(0, (s.length() + 1) / 2).equals(reverse(s.substring(s.length() / 2))) ? "yes" : "no");
    }

    static String reverse(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++)
            r += s.charAt(s.length() - i - 1);
        return r;
    }
}