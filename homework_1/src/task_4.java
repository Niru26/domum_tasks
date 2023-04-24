import java.util.Arrays;
import java.util.Random;

public class task_4 {
    public static void main(String[] args) {

        System.out.println("Enter size, random numbers range (minimum & maximum)");
        int arraySize = (int) task_1.getData();
        int minRandomValue = (int) task_1.getData();
        int maxRandomValue = (int) task_1.getData();

        int[] randomValuesArray = generatesArray(arraySize, minRandomValue, maxRandomValue);
        System.out.println(Arrays.toString(randomValuesArray));

        System.out.println("Summary of array value from even indexes:");
        System.out.println(countValuesInEvenIndexes(arraySize, randomValuesArray));
        System.out.println("Array values with even indexes:");
        showArrayValues(arraySize, randomValuesArray);
    }

    private static void showArrayValues(int arraySize, int[] randomValuesArray) {
        for (int i = 0; i < arraySize; i+=2) {
            System.out.println(randomValuesArray[i]);
        }
    }

    private static int countValuesInEvenIndexes(int arraySize, int[] randomValuesArray) {
        int summaryEvenIndexes = 0;
        for (int i = 0; i < arraySize; i+=2) {
            summaryEvenIndexes += randomValuesArray[i];
        }
        return summaryEvenIndexes;
    }

    private static int[] generatesArray(int arraySize, int minValue, int maxValue) {
        int[] generatedArray = new int [arraySize];
        for (int i = 0; i < arraySize; i++) {
            generatedArray[i] = doRandomInt(minValue, maxValue);
        }
        return generatedArray;
    }

    private static int doRandomInt(int minValue, int maxValue) {
        Random randomizer = new Random();
        return randomizer.nextInt(minValue, maxValue);
    }
}
