import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // ===== ЗАДАЧА 1 =====
        System.out.println("=== Задача 1: Статистика выплат ===");

        int[] inputArray1 = {1000, 2500, 3000, 1500, 4000};

        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        for (int value : inputArray1) {
            sum += value;

            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }
        }

        float average = (float) sum / inputArray1.length;

        float[] outputArray1 = {sum, max, min, average};

        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));


        // ===== ЗАДАЧА 2 =====
        System.out.println("\n=== Задача 2: Налог 13% ===");

        int[] inputArray2 = {30000, 45000, 50000, 25000, 60000};
        float[] outputArray2 = new float[inputArray2.length];

        int index = 0;
        for (int value : inputArray2) {
            outputArray2[index] = value * 0.13f;
            index++;
        }

        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));


        // ===== ЗАДАЧА 3 =====
        System.out.println("\n=== Задача 3: Бонусы > 5000 ===");

        int[] inputArray3 = {4000, 7000, 5500, 3000, 8000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        int i = 0;
        for (int value : inputArray3) {
            outputArray3[i] = value > 5000;
            i++;
        }

        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));


        // ===== ЗАДАЧА 4 =====
        System.out.println("\n=== Задача 4: Проверка просрочек ===");

        int[] inputArray4 = {1000, 2000, -500, 3000, 4000};
        boolean isPositive = true;

        for (int value : inputArray4) {
            if (value < 0) {
                isPositive = false;
                break;
            }
        }

        boolean[] outputArray4 = {isPositive};

        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));


        // ===== ЗАДАЧА 5 =====
        System.out.println("\n=== Задача 5: Рентабельные месяцы ===");

        int[] inputArray5 = {10000, -2000, 5000, -1000, 7000};
        int count = 0;

        for (int value : inputArray5) {
            if (value > 0) {
                count++;
            }
        }

        int[] outputArray5 = {count};

        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));
    }
}