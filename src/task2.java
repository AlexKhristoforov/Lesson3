public class task2 {
    public static void main(String[] args) {
        int[] array = new int[]{13, 222, 3, 5, 9, 0, 13, 0, 3, 9, 13};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            }

            int[] counter = new int[max + 1];
            for (int i = 0; i < array.length; i++) {
                counter[array[i]]++;
            }

            for (int i = 0; i < counter.length; i++) {
                if (counter[i] > 2)
                    System.out.println("[" + i + "] - повторений [" + counter[i] + "]");
            }
        }
    }