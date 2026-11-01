import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][(i & 1) == 0 ? j : arr[i].length - j - 1] = arr[i].length * i + j;

        for (int[] i : arr) {
            for (int j : i)
                System.out.print((j > 9 ? " " : "  ") + j);
            System.out.println();
        }
    }
}
