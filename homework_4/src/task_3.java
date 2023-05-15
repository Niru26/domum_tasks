import java.util.LinkedList;

public class task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> startingList = generateEvenList(10);
        System.out.println("Initial array: " + startingList);
        int summary = 0;
        for (Integer number:
             startingList) {
            summary += number;
        }
        System.out.println("Element summary: " + summary);
    }
    private static LinkedList<Integer> generateEvenList(int listSize) {
        LinkedList<Integer> initial_list = new LinkedList<>();
        for (int i = 1; i <= listSize; i++) {
            if (i%2 != 0) continue;
            initial_list.add(i);
        }
        return  initial_list;
    }
}
