import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        System.out.println(findDuplicate(s));
    }

    private static char findDuplicate(String s) {
        int[] counts = new int[128];

        for (char c : s.toCharArray()) {
            counts[c]++;
            if (counts[c] == 2)
                return c;
        }

        return ' ';
    }
}