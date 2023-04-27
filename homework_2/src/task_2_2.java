import java.util.Arrays;
import java.util.Scanner;

public class task_2_2 {
    public static void main(String[] args) {
        int numberOfStrings = enteredNumber();
        int numberOfProducts = enteredNumber();
        String[] recipeArray = createsStringsArray(numberOfStrings);
        String[] productsArray = createsStringsArray(numberOfProducts);
        String[] capitalizedArray = setCapitalLetters(productsArray);

        for (int i = 0; i < recipeArray.length; i++) {
            for (String testedString : productsArray) {
                recipeArray[i] = recipeArray[i].replace(testedString.split(" ")[0], testedString.split(" ")[2]);
                System.out.println(recipeArray[i]);
            }
           System.out.println(recipeArray[i]);
        }
    }

    private static String[] setCapitalLetters(String[] productsArray) {
        String[] modifiedProductsArray = new String[productsArray.length];
        for (int i = 0; i < productsArray.length; i++) {
        String modifiedString = setCapitalLetter(productsArray, i, 0)
                + " - " + setCapitalLetter(productsArray, i, 2);
            modifiedProductsArray[i] = modifiedString;
        }
        return modifiedProductsArray;
    }

    private static String setCapitalLetter(String[] productsArray, int stringPosition, int wordPosition) {
        String word = productsArray[stringPosition].split(" ")[wordPosition];
        char[] wordByChar = word.toCharArray();
        char firstLetter = wordByChar[0];
        wordByChar[0] = Character.toUpperCase(firstLetter);
        return String.valueOf(wordByChar);
    }

    private static String[] createsStringsArray(int numberOfStrings) {
        String[] stringsArray = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            stringsArray[i] = enteredText();
        }
        return stringsArray;
    }

    private static String enteredText() {
        Scanner enteredText = new Scanner(System.in);
        return enteredText.nextLine();
    }

    private static int enteredNumber() {
        Scanner enteredData = new Scanner(System.in);
        return enteredData.nextInt();
    }
}
