public class task1 {
    public static void main(String[] args) {


        int[] array
                = {33, 44, 1, 0, 23, 234, 12, 1, 44, 12};
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max)
                array[i] = 99;
            if (array[i] == min)
                array[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
