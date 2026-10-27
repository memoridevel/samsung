import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c;
        if ((a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) && b >= 1 && b <= 31
                || (a == 4 || a == 6 || a == 9 || a == 11) && b >= 1 && b <= 30 || a == 2 && b >= 1 && b <= 28) {
            switch (a) {
                case 2:
                    c = 31;
                    break;
                case 3:
                    c = 31 + 28;
                    break;
                case 4:
                    c = 31 * 2 + 28;
                    break;
                case 5:
                    c = 31 * 2 + 30 + 28;
                    break;
                case 6:
                    c = 31 * 3 + 30 + 28;
                    break;
                case 7:
                    c = 31 * 3 + 30 * 2 + 28;
                    break;
                case 8:
                    c = 31 * 4 + 30 * 2 + 28;
                    break;
                case 9:
                    c = 31 * 5 + 30 * 2 + 28;
                    break;
                case 10:
                    c = 31 * 5 + 30 * 3 + 28;
                    break;
                case 11:
                    c = 31 * 6 + 30 * 3 + 28;
                    break;
                case 12:
                    c = 31 * 6 + 30 * 4 + 28;
                    break;
                default:
                    c = 0;
            }
            System.out.println(365 - b - c);
        } else
            System.out.println(-1);
    }
}