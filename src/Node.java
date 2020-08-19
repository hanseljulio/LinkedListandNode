public class Node<E> {
    private E data;
    private Node<E> next;

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public Node(E data) {
        this(data, null);
    }

    public boolean equals(Object o) {
        if (o instanceof Node<?> && ((Node<?>) o).data.equals(this.data)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return data.toString();
    }

    // To get the data in the LinkedList
    public E getData() {
        return data;
    }
}
