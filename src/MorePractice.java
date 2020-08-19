import java.util.*;

public class MorePractice {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        list1.add(new Node(1,null));
        list1.add(new Node(3,null));
        list1.add(new Node(7,null));
        list1.add(new Node(8,null));

        list2.add(new Node(2,null));
        list2.add(new Node(5,null));
        list2.add(new Node(7,null));
        list2.add(new Node(10,null));

        System.out.println(mergeLists(list1, list2));
        System.out.println(list1.getParent(new Node<>(1)));
        list1.truncateList(7);
        System.out.println(list1.toString());
    }

    public static <E extends Comparable<E>> LinkedList<E> mergeLists(LinkedList<E> list1, LinkedList<E> list2) {
        LinkedList<E> list3 = new LinkedList<>();

        Node<E> current = list1.getFirst();
        Node<E> current2 = list2.getFirst();

        while (current != null || current2 != null) {
            if (current == null) {
                Node<E> data2 = new Node<>(current2.getData());
                list3.add(data2);
                current2 = current2.getNext();
            } else if (current2 == null) {
                Node<E> data = new Node<>(current.getData());
                list3.add(data);
                current = current.getNext();

            } else if (current.getData().compareTo(current2.getData()) < 0) {
                Node<E> data = new Node<>(current.getData());
                list3.add(data);
                current = current.getNext();
            }
            else if (current2.getData().compareTo(current.getData()) < 0) {
                Node<E> data2 = new Node<>(current2.getData());
                list3.add(data2);
                current2 = current2.getNext();
            }
            else {
                Node<E> data3 = new Node<>(current2.getData());
                list3.add(data3);
                current2 = current2.getNext();

            }
        }
        return list3;
    }


}
