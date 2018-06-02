public class task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int temporary = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        for (int i = 0; i < array.length / 2; i++) {
            temporary = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temporary;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            System.out.printf("%d ", array[i]);
        }
    }

}
