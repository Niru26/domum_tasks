class queue {
    private int[] testArray;
    private int first_element;
    private int last_element;
    private int capacity;
    private int quantity;

    queue(int size) {
        testArray = new int[size];
        capacity = size;
        first_element = 0;
        last_element = -1;
        quantity = 0;
    }

    public int first() {
        if (isEmpty()) {
            System.out.println("No, no, no... you do right");
            System.exit(-1);
        }

        int value = testArray[first_element];

        System.out.println("Removing " + value);

        first_element = (first_element + 1) % capacity;
        quantity--;

        return value;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("No, no, no... you do right");
            System.exit(-1);
        }

        System.out.println("Inserting " + item);

        last_element = (last_element + 1) % capacity;
        testArray[last_element] = item;
        quantity++;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("No, no, no... you do right");
            System.exit(-1);
        }
        return testArray[first_element];
    }

    public int size() {
        return quantity;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == capacity);
    }
}