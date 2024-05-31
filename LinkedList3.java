package assignment_2;

import java.util.LinkedList;

public class LinkedList3 {
    public static class LinkedList {
        private Node head;

        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }


        public void deleteAfterNode(Node node) {
            if (node == null || node.next == null) {
                System.out.println("Cannot delete. Given node is null or the last node.");
                return;
            }

            Node nodeToDelete = node.next;
            node.next = nodeToDelete.next;
        }


        public void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }


        public static void main(String[] args) {
            LinkedList list = new LinkedList();


            list.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);

            list.head.next = second;
            second.next = third;
            third.next = fourth;

            System.out.println("Original linked list:");
            list.print();


            Node nodeToDeleteAfter = second;
            list.deleteAfterNode(nodeToDeleteAfter);

            System.out.println("Linked list after deleting node after the second node:");
            list.print();
        }
    }
}
