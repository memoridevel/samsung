import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[n][m], res = new int[m][n];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                res[j][n - i - 1] = arr[i][j];

        System.out.println(m + " " + n);
        for (int[] i : res) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
