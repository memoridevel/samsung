import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;
        while (scanner.hasNext()) {
            String d = scanner.next();
            int n = scanner.nextInt();
            switch (d) {
                case "North":
                    y += n;
                    break;
                case "South":
                    y -= n;
                    break;
                case "East":
                    x += n;
                    break;
                case "West":
                    x -= n;
                    break;
            }
        }
        System.out.println(x + " " + y);
    }
}