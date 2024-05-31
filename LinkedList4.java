package assignment_2;

public class LinkedList4 {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static class LinkedList {
            Node head;

            public boolean searchNode(int value) {
                Node current = head;

                while (current != null) {

                    if (current.data == value) {
                        return true; // Node found
                    }

                    current = current.next;
                }


                return false;
            }

            public void add(int data) {

                Node newNode = new Node(data);

                if (head == null) {
                    head = newNode;
                    return;
                }

                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }


                current.next = newNode;
            }

            public void printList() {
                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {

            LinkedList list = new LinkedList();


            list.add(19);
            list.add(22);
            list.add(32);
            list.add(44);
            list.add(65);

            list.printList();

            int value_searched = 44;
            boolean value_found = list.searchNode(value_searched);

            if (value_found) {
                System.out.println("Value " + value_searched + " is found!");
            } else {
                System.out.println("Value not found.");
            }
        }


}
