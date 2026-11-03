import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(), r = "";
        int n = scanner.nextInt();
        for (int i = 0; i < s.length(); i++) {
            char c = (char) (s.charAt(i) - n);
            if (c < 'A')
                c += 26;
            r += c;
        }

        System.out.println(r);
    }
}