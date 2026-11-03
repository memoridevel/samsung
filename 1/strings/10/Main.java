import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().toLowerCase().split(" +");
        for (String s : arr)
            System.out.print(s + " ");
    }
}