import java.util.NoSuchElementException;

public class LinkedList<E> {
    private Node<E> first;

    public void add(Node<E> node) {
        if (first == null) {
            first = new Node<>(node.getData());
        } else {
            Node<E> current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public void add(Node<E> node, int index) {
        if (index < 0 || index > 0 && first == null) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            first = new Node<>(node.getData(), first);
        } else {
            Node<E> current = first;
            for (int i = 0; i < index - 1; i++) { // Or it will loop through the null
                current = current.getNext();
                if (current == null) {
                    throw new IndexOutOfBoundsException();
                }
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
    }

    public void remove(E value) {
        if (first == null) {
            // DO NOTHING

        } else if (first != null && first.getData().equals(value)) {
            first = first.getNext();

        } else {
            Node<E> current = first;
            while (current.getNext() != null) {
                if (current.getNext().getData().equals(value)) {
                    current.setNext(current.getNext().getNext());
                    break; // Otherwise it's not just the first instance that's removed
                } else {
                    current = current.getNext();
                }
            }
        }
    }

    public boolean exists(Node<E> node) {
        if (first == null) {
            return false;
        } else {
            Node<E> current = first;
            while (current != null) {
                if (current.equals(node)) {
                    return true;
                }
                current = current.getNext();
            }
            return false;
        }
    }

    public boolean equals(Object o) {
        if (o instanceof LinkedList<?>) {
            LinkedList<?> list = (LinkedList<?>) o;
            Node<?> current = list.getFirst();
            if (this.size() == list.size()) { // Will possibly return true if the sizes are the same
                for (int i = 0; i < list.size(); i++) {
                    if (!current.equals(this.get(i))) { // if list != this, return false
                        return false;
                    }
                    current = current.getNext();
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public String toString() { // needed cause it just prints out the memory data
        String result = "";
        if (first != null) {
            result = first.toString();
            for (Node<E> current = first.getNext(); current != null; current = current.getNext()) {
                result += " " + current.toString();
            }
        }
        return result;
    }

    // Need to check the size for checking elements.
    public int size() {
        int size = 0;
        Node<E> current = first;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    // Need to be able to loop through every content and get the first in the list
    public Node<E> get(int index) {
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public Node<E> getFirst() {
        return this.first;
    }

    public Node<E> getParent(Node<E> node) {
        if (node.equals(first)) {
            return null;
        }
        Node<E> current = first;
        while (current.getNext() != null) {
            if (current.getNext().equals(node)) {
                if (current == first) {
                    return first;
                } else if (current == first.getNext()){
                   return current;
                } else {
                    return current;
                }
            }
            current = current.getNext();
        }
        throw new NoSuchElementException();
    }
// if value is the first element, wipe everything
    public void truncateList(E value) {
        Node<E> current = first;
        while (current.getNext() != null) {
            if (first.getData().equals(value)) {
                first = null;
                break;
            } else if (current.getNext().getData().equals(value)) {
                current.setNext(null);
            } else {
                current = current.getNext();
            }
        }
    }

    public Node<E> getLast() {
        Node<E> current = first;
        while (current.getNext() != null) {
            current = current.getNext();

        }
        return current;
    }
}
