import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class task_2 {
    public static void main(String[] args) {
        int length = task_1.getData();
        int minimum = task_1.getData();
        int maximum = task_1.getData();
        ArrayList<Integer> targetList = (ArrayList<Integer>) task_1.generateRandomList(length, minimum, maximum);
        System.out.println(targetList);
        int minimumInList = Collections.min(targetList);
        int maximumInList = Collections.max(targetList);
        float averageValueOfListItems = (float) findSum(targetList) / length;
        System.out.printf("Minimum: %d, maximum: %d, average: %.2f.", minimumInList, maximumInList,
                averageValueOfListItems);
    }
    public static int findSum(ArrayList<Integer> targetList) {
        Iterator<Integer> searchArrayList = targetList.iterator();
        int sum = 0;
        while (searchArrayList.hasNext()) {
            sum += searchArrayList.next();
        }
        return sum;
    }
}
