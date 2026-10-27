public class MyArrays {
    public static void minToBegin(int[] array) {
        int min = 0;
        for (int i = 1; i < array.length; i++)
            if (array[i] < array[min])
                min = i;

        int val = array[min];

        for (int i = min; i > 0; i--)
            array[i] = array[i - 1];

        array[0] = val;
    }
}