import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        T data = head.data;
        head = head.next;
        if (isEmpty()) {
            tail = null;
        }
        size--;
        return data;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (!isEmpty()) {
            Node<T> current = head;
            sb.append(current.data);
            current = current.next;
            while (current != null) {
                sb.append(", ");
                sb.append(current.data);
                current = current.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
