// File: linked_list.java
public class linked_list {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        Node head;

        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node last = head;
            while (last.next != null) last = last.next;
            last.next = newNode;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("None");
        }

        public boolean search(int key) {
            Node current = head;
            while (current != null) {
                if (current.data == key) return true;
                current = current.next;
            }
            return false;
        }

        public void delete(int key) {
            Node current = head;

            if (current != null && current.data == key) {
                head = current.next;
                return;
            }

            Node prev = null;
            while (current != null && current.data != key) {
                prev = current;
                current = current.next;
            }

            if (current == null) {
                System.out.println("Key " + key + " not found.");
                return;
            }

            prev.next = current.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);

        System.out.println("Initial Linked List:");
        ll.printList();

        System.out.println("\nSearching for 20:");
        System.out.println(ll.search(20) ? "Found!" : "Not Found");

        System.out.println("\nDeleting 20:");
        ll.delete(20);
        ll.printList();

        System.out.println("\nDeleting 50 (non-existent):");
        ll.delete(50);
        ll.printList();
    }
}
