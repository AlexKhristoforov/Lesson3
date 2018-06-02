import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int lenght = 0;
        int numberTemp = number;

        while (number > 0) {
            number /= 10;
            lenght++;
        }

        int[] array = new int[lenght];
        System.out.println("");

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = numberTemp % 10;
            numberTemp /= 10;
        }

        System.out.println("Our array");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }

        boolean increasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing)
            System.out.println("increasing");
        else System.out.println("not increasing");
    }
}