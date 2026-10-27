public class MyArrays {
    public static double avgOf4Digit(int[] n) {
        double s = 0;
        int i = 0;
        for (int e : n) {
            if (e / 10000 == 0 && e / 1000 > 0) {
                s += e;
                i++;
            }
        }
        return s > 0 ? s / i : -1;
    }
}