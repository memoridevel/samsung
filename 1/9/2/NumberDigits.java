public class NumberDigits {
    public static int sumOfSeven(int a, int b) {
        int c = 0;
        for (; a <= b; a++) {
            if (a / 100 == 0 && a / 10 > 0 && a % 7 == 0)
                c += a % 10 + a / 10;
        }
        return c;
    }
}