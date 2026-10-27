public class MyMath {
    public static long min(long a, long b, long c, long d) {
        if (a < b)
            if (a < c)
                if (a < d)
                    return a;
                else
                    return d;
            else if (c < d)
                return c;
            else
                return d;
        else if (b < c)
            if (b < d)
                return b;
            else
                return d;
        else if (c < d)
            return c;
        else
            return d;
    }
}