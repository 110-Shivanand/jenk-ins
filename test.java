// File: LinkedListTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    @Test
    public void testInsertAndSearch() {
        linked_list.SinglyLinkedList ll = new linked_list.SinglyLinkedList();

        ll.insert(10);
        ll.insert(20);

        assertTrue(ll.search(10), "10 should be found in the list");
        assertFalse(ll.search(30), "30 should NOT be found in the list");
    }

    @Test
    public void testDelete() {
        linked_list.SinglyLinkedList ll = new linked_list.SinglyLinkedList();

        ll.insert(10);
        ll.insert(20);

        // Delete existing element
        ll.delete(10);
        assertFalse(ll.search(10), "10 should be deleted from the list");

        // Delete non-existent element
        ll.delete(50); // Should just print "Key 50 not found."
        assertFalse(ll.search(50), "50 was never in the list");
    }
}
