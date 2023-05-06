import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    void testEnqueue() {
        Queue<String> q = new Queue<>();
        assertTrue(q.isEmpty());

        q.enqueue("apple");
        assertEquals("apple", q.toString());
        assertFalse(q.isEmpty());

        q.enqueue("banana");
        assertEquals("[apple, banana]", q.toString());
        assertFalse(q.isEmpty());

        q.enqueue("cherry");
        assertEquals("[apple, banana, cherry]", q.toString());
        assertFalse(q.isEmpty());
    }

    @Test
    void testDequeue() {
        Queue<String> q = new Queue<>();
        assertThrows(NoSuchElementException.class, q::dequeue);

        q.enqueue("apple");
        q.enqueue("banana");
        q.enqueue("cherry");
        assertFalse(q.isEmpty());

        assertEquals("apple", q.dequeue());
        assertEquals("[banana, cherry]", q.toString());
        assertFalse(q.isEmpty());

        assertEquals("banana", q.dequeue());
        assertEquals("[cherry]", q.toString());
        assertFalse(q.isEmpty());

        assertEquals("cherry", q.dequeue());
        assertEquals("[]", q.toString());
        assertTrue(q.isEmpty());

        assertThrows(NoSuchElementException.class, q::dequeue);
    }
}
