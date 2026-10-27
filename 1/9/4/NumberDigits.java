public class NumberDigits {
    public static void binFraction(double x, int n) {
        double frac = x - (int) x;

        for (int i = 0; i < n; i++) {
            frac *= 2;
            int bit = (int) frac;
            System.out.print(bit);
            frac -= bit;
        }
    }
}