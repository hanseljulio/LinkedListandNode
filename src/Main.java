public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        LinkedList<Integer> empty = new LinkedList<Integer>();
        LinkedList<Integer> tester = new LinkedList<>();
        LinkedList<Integer> tester2 = new LinkedList<>();

        Node<Integer> node = new Node<>(1, null);
        Node<String> node2 = new Node<>("Hi", null);
        Node<Integer> node3 = new Node<>(1, null);

        list.add(new Node(0, null));
        list.add(new Node(2, null));
        list.add(new Node(5, null));
        list.add(new Node(4, null));

        tester.add(new Node(0, null));
        tester.add(new Node(2, null));
        tester.add(new Node(5, null));
        tester.add(new Node(4, null));

        tester2.add(new Node(0, null));
        tester2.add(new Node(2, null));
        tester2.add(new Node(4, null));
        tester2.add(new Node(5, null));

        // Equals test (Node)
        nodeEqualTest(node, node3);
        nodeEqualTest(node, node2);

        // Identical lists
        System.out.println(equalsTest(list, tester));
        System.out.println();
        // Different length
        System.out.println(equalsTest(list, empty));
        System.out.println();
        // Same length, different content
        System.out.println(equalsTest(list, tester2));
        System.out.println();

        // Add one
        System.out.println(list.toString());
        addOne(list);
        System.out.println();
        System.out.println(list.toString());

        // Add two
        addTwo(list);
        System.out.println();
        System.out.println(list.toString());
//        indexTest(list, -1);
//        System.out.println();
//        System.out.println(list.toString()); -> IndexOutOfBoundsException
//        indexTest(list, 8);
//        System.out.println();
//        System.out.println(list.toString()); -> IndexOutOfBoundsException

        // Add to the front of the list
        indexTest(list, 10, 0);
        System.out.println();
        System.out.println(list.toString());

        // Add to the middle of the list
        indexTest(list, 12, 4);
        System.out.println();
        System.out.println(list.toString());

        // Add to the last of the list
        indexTest(list, 10, 9);
        System.out.println();
        System.out.println(list.toString());

        // Removes the first element
        removeElement(list, 10);
        System.out.println();
        System.out.println(list.toString());

        // Removes the middle element
        removeElement(list, 4);
        System.out.println();
        System.out.println(list.toString());

        // Removes the last element
        removeElement(list, 10);
        System.out.println();
        System.out.println(list.toString());

        // Removes an element that does not exist
        removeElement(list, 20);
        System.out.println();
        System.out.println(list.toString());

        // Remove element from empty list
        removeElement(empty, 0);
        System.out.println();
        System.out.println(list.toString());

        // First element exists
        System.out.println();
        System.out.println(existTest(list, 0));

        // Middle element exists
        System.out.println();
        System.out.println(existTest(list, 12));

        // Last element exists
        System.out.println();
        System.out.println(existTest(list, 1));

        // Not in the list
        System.out.println();
        System.out.println(existTest(list, 30));
    }

    public static void nodeEqualTest(Node<?> node, Node<?> node2) {
        System.out.println(node.equals(node2));
        System.out.println();
    }

    // Add
    public static <E> void addOne(LinkedList<E> node) {
        node.add(new Node(3, null));
    }

    public static <E> void addTwo(LinkedList<E> node) {
        node.add(new Node(6, null));
        node.add(new Node(1, null));
    }

    // Add by index
    public static <E> void indexTest(LinkedList<E> node, int value, int index) {
        node.add(new Node(value, null), index);
    }

    // Remove
    public static <E> void removeElement(LinkedList<E> node, E value) {
        node.remove(value);
    }

    // Exists test
    public static <E> boolean existTest(LinkedList<E> node, E value) {
        Node<E> test = new Node(value, null);
        return node.exists(test);
    }

    // Equals test
    public static <E> boolean equalsTest(LinkedList<E> list, LinkedList<E> node) {
        return list.equals(node);
    }


}
