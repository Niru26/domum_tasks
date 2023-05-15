public class task_2 {
    public static void main(String[] args) {
        // создаем queue емкостью 5
        queue testQueue = new queue(5);
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);

        System.out.println("The 1st element is " + testQueue.peek());
        testQueue.first();
        System.out.println("The 1st element is " + testQueue.peek());

        System.out.println("The queue size is " + testQueue.size());

        testQueue.first();
        testQueue.first();

        if (testQueue.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}
