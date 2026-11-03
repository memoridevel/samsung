import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String max = "";
        String[] s = scanner.nextLine().split(" ");
        for (String i : s)
            if (i.length() > max.length())
                max = i;
        System.out.println(max);
        System.out.println(max.length());
    }
}