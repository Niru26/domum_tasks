import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task_1_4_7 {
    public static void main(String[] args) {
        System.out.println("Enter list size, random numbers range (minimum & maximum)");
        int listSize = (int) task_1_1.getData();
        int minRandomValue = (int) task_1_1.getData();
        int maxRandomValue = (int) task_1_1.getData();


        List<Integer> initialList = makeList(listSize, minRandomValue, maxRandomValue);
        System.out.println("Initial list: " + initialList);
        List<Integer> generatedUniqueElementsList = generateUniqueList(listSize, initialList);
        System.out.println("Finished list of unique elements: " + generatedUniqueElementsList);
        printListElements(generatedUniqueElementsList);
    }

    private static void printListElements(List<Integer> generatedUniqueElementsList) {
        System.out.println("Elements in separate strings:");
        for (int value:
                generatedUniqueElementsList) {
            System.out.println(value);
        }
    }

    private static List<Integer> generateUniqueList(int listSize, List<Integer> initialList) {
        List<Integer> uniqueElementsList = new ArrayList<>();
        int occurCounter = 0;
        for (int i = 0; i < listSize; i++) {
            int checkingElement = initialList.get(i);
            for (int j = 0; j < listSize; j++) {
                if (checkingElement == initialList.get(j)) {
                    occurCounter += 1;
                }
            }
            if (occurCounter == 1) {
                uniqueElementsList.add(checkingElement);
            }
            occurCounter = 0;
        }
        return uniqueElementsList;
    }

    private static List<Integer> makeList(int listSize, int minRandomValue, int maxRandomValue) {
        List<Integer> randomValuesList = new ArrayList<>();
        for (int i = 0; i < listSize; i++) {
            randomValuesList.add(randomizer(minRandomValue, maxRandomValue));
        }
        return randomValuesList;
    }

    private static int randomizer(int minimumValue, int maximumValue) {
        Random randomValue = new Random();
        return randomValue.nextInt(minimumValue, maximumValue);
        }
    }
