import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prev = scanner.nextInt();

        int maxLength = 1, currentLength = 1, direction = 0, curr;

        while ((curr = scanner.nextInt()) != 0) {
            if (curr > prev)
                if (direction == 1)
                    currentLength++;
                else {
                    currentLength = 2;
                    direction = 1;
                }
            else if (curr < prev)
                if (direction == -1)
                    currentLength++;
                else {
                    currentLength = 2;
                    direction = -1;
                }
            else {
                currentLength = 1;
                direction = 0;
            }

            if (currentLength > maxLength)
                maxLength = currentLength;

            prev = curr;
        }

        System.out.println(maxLength);
    }
}