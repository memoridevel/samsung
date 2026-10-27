import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), i = 25, m = 0;
        while (i < n) {
            if ((i & 1) == 0)
                m += i;
            i++;
        }
        System.out.println(m);
    }
}