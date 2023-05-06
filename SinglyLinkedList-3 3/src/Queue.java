import java.util.NoSuchElementException;

public class Queue<T> {
    private SinglyLinkedList<T> list;

    public Queue() {
        list = new SinglyLinkedList<T>();
    }

    public void enqueue(T element) {
        list.addLast(element);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
