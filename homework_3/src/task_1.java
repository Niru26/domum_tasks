import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        int length = getData();
        int minimum = getData();
        int maximum = getData();

        List<Integer> listOfRandomValues = generateRandomList(length, minimum, maximum);
        System.out.println(listOfRandomValues);
        removeEvenNumbers(listOfRandomValues);
        System.out.println(listOfRandomValues);
    }
    public static Integer getData() {
        Scanner entryData = new Scanner(System.in);
        return entryData.nextInt();
    }
    public static List<Integer> generateRandomList(int length, int minimum, int maximum) {
        List<Integer> randomList = new ArrayList<>();
        Random randomizer = new Random();
        for (int i = 0; i < length; i++) {
            randomList.add(randomizer.nextInt(minimum, maximum));
        }
        return randomList;
    }
    public static void removeEvenNumbers(List<Integer> checkingList) {
        checkingList.removeIf(integer -> integer % 2 == 0);
    }
}
    /*
        public static void removeEvenNumbers(List<Integer> checkingList) {
        Iterator<Integer> scannedList = checkingList.iterator();
        while (scannedList.hasNext()) {
            if (scannedList.next() % 2 == 0) {
                scannedList.remove();
            }
        }
    }
     */


