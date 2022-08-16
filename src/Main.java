import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));

        //task1
        int sum = 0;
        for (int payments : arr) {
            sum += payments;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //task 2
        int minCosts = arr[0];
        int maxCosts = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxCosts) {
                maxCosts = arr[i];
            }
            if (arr[i] < minCosts) {
                minCosts = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCosts + " рублей. Максимальная сумма трат за день составила " + maxCosts + " рублей");
        //task3
        double days = 30;
        double averageСosts = sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + averageСosts + " рублей");
        //task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i-1]);
        }
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}