class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None

    # Insert at the end of the list
    def insert(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return
        last = self.head
        while last.next:
            last = last.next
        last.next = new_node

    # Print the linked list
    def print_list(self):
        current = self.head
        while current:
            print(f"{current.data} -> ", end="")
            current = current.next
        print("None")

    # Search for a value
    def search(self, key):
        current = self.head
        while current:
            if current.data == key:
                return True
            current = current.next
        return False

    # Delete a node by value
    def delete(self, key):
        current = self.head

        # If head holds the key
        if current and current.data == key:
            self.head = current.next
            return

        prev = None
        while current and current.data != key:
            prev = current
            current = current.next

        if current is None:
            print(f"Key {key} not found.")
            return

        prev.next = current.next


if __name__ == "__main__":
    ll = SinglyLinkedList()
    
    # Insert sample data
    ll.insert(10)
    ll.insert(20)
    ll.insert(30)
    ll.insert(40)

    print("Initial Linked List:")
    ll.print_list()

    print("\nSearching for 20:")
    found = ll.search(20)
    print("Found!" if found else "Not Found")

    print("\nDeleting 20:")
    ll.delete(20)
    ll.print_list()

    print("\nDeleting 50 (non-existent):")
    ll.delete(50)
    ll.print_list()
