import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j = 0, n = sc.nextInt();
        while (j < n) {
            if ((i & 1) == 0) {
                System.out.print(i + " ");
                j++;
            }
            i++;
        }
    }
}