import java.util.Arrays;
import java.util.Scanner;

public class task_2_1 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        String initialString = inputData.nextLine();
        int[] indexesArray = generateIndexesArray(initialString);
        System.out.println(Arrays.toString(indexesArray));
        reverseAndPrintResult(initialString, indexesArray);
    }

    private static void reverseAndPrintResult(String initialString, int[] indexesArray) {
        String reversedString = "";

        for (int i = 0; i < indexesArray.length; i++) {
              char letter = initialString.charAt(indexesArray[i] - 1);
              reversedString += letter;
        }
        System.out.println(reversedString);
    }

    private static int[] generateIndexesArray(String initialString) {
        int[] symbolIndexes = new int[initialString.length()];
        for (int i = 0; i < symbolIndexes.length; i++) {
            symbolIndexes[i] = (symbolIndexes.length - i);
        }
        return  symbolIndexes;
    }
}
