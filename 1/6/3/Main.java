import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n + " TORT");
        switch (n % 10) {
            case 1:
                if (n % 100 < 11 || n % 100 > 14)
                    break;
            case 2:
            case 3:
            case 4:
                if (n % 100 < 11 || n % 100 > 14) {
                    System.out.println("A");
                    break;
                }
            default:
                System.out.println("OV");
        }
    }
}