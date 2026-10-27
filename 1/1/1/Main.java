import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = Integer.parseInt(s.substring(0, s.indexOf(" "))), b = Integer.parseInt(s.substring(s.indexOf(" ") + 1));
        System.out.println(a + b);
    }
}