import java.util.LinkedList;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = generateOddList(15);
        System.out.println(myList);
        reversingList(myList);

    }

    private static void reversingList(LinkedList<Integer> myList) {
        LinkedList reverseList = new LinkedList<>();
        for (int value:
                myList) {
            reverseList.addFirst(value);
        }
        System.out.println(reverseList);
    }

    private static LinkedList<Integer> generateOddList(int listSize) {
        LinkedList<Integer> initial_list = new LinkedList<>();
        for (int i = 1; i <= listSize; i++) {
            if (i%2 == 0) continue;
            initial_list.add(i);
        }
        return  initial_list;
    }
}