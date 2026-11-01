import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2 * n + 1][2 * n + 1];
        int x = arr.length / 2, y = arr.length / 2;

        for (int i = 0, c = 1; c < arr.length * arr.length; i++) {
            y--;
            arr[y][x] = c++;
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                x--;
                arr[y][x] = c++;
            }
            for (int j = 0; j < (i + 1) * 2; j++) {
                y++;
                arr[y][x] = c++;
            }
            for (int j = 0; j < (i + 1) * 2; j++) {
                x++;
                arr[y][x] = c++;
            }
            for (int j = 0; j < (i + 1) * 2; j++) {
                y--;
                arr[y][x] = c++;
            }
        }

        for (int[] i : arr) {
            for (int j : i)
                System.out.print((j > 9 ? " " : "  ") + j);
            System.out.println();
        }
    }
}
