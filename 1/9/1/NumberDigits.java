public class NumberDigits {
    public static int sumOfDigits(int d) {
        int s = 0;
        while (d > 0) {
            s += d % 10;
            d /= 10;
        }
        return s;
    }
}
