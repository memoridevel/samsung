public class NumberDigits {
    public static int sumOfThirteen(int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = i; j > 0; j /= 10)
                c += j % 10;
            if (c % 13 == 0)
                s++;
        }
        return s;
    }
}