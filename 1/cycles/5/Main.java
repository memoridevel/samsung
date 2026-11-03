import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0, count = 0, currentNumber;

        while ((currentNumber = scanner.nextInt()) != 0) {
            if (currentNumber == max)
                count++;
            else if (currentNumber > max) {
                max = currentNumber;
                count = 1;
            }
        }

        System.out.println(count);
    }
}