package assignment_2;

public class linkedList2 {
    public static class LinkedList {
        private Node head;

        public void deleteAtPosition(int position) {
            if (head == null) {
                throw new IndexOutOfBoundsException("List is empty");
            }

            if (position == 1) {
                head = head.next;
            } else {
                Node current = head;
                int count = 1;

                while (current != null && count < position - 1) {
                    current = current.next;
                    count++;
                }

                if (current == null || current.next == null) {
                    throw new IndexOutOfBoundsException("Invalid position");
                }

                current.next = current.next.next;
            }
        }

        public void display() {
            Node current = head;

            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        private static class Node {
            private int data;
            private Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // Example usage:
        public static void main(String[] args) {
            LinkedList linkedList = new LinkedList();

            linkedList.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);

            linkedList.head.next = second;
            second.next = third;
            third.next = fourth;

            System.out.println("Original linked list:");
            linkedList.display();

            // Delete node at position 2
            int positionToDelete = 2;
            linkedList.deleteAtPosition(positionToDelete);
        }
    }

}
