import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == n - 1)
                    arr[i][j] = 1;
                else if (i + j > n - 1)
                    arr[i][j] = 2;
                else
                    arr[i][j] = 0;
            }

        for (int[] i : arr) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
