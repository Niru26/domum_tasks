import java.util.Scanner;

public class task_2_0 {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String jewelers = inputData.nextLine();
        String stones = inputData.nextLine();
        countJewelryInStones(jewelers, stones);
    }

    private static void countJewelryInStones(String jewelers, String stones) {
        int jewelersCounter = 0;
        char nameOfJewelry = ' ';

        for (int i = 0; i < jewelers.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewelers.charAt(i) == stones.charAt(j))
                    jewelersCounter += 1;
            }
            if (jewelersCounter > 0)
                nameOfJewelry = jewelers.charAt(i);
            System.out.printf("%c%d", nameOfJewelry, jewelersCounter);
            jewelersCounter = 0;
            nameOfJewelry = ' ';
        }
    }
}
