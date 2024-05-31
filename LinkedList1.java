package assignment_2;

public class LinkedList1 {
    private Node head;

    public void insertAtPos(int data, int position) {
        Node newnode = new Node(data);

        if (position == 1) {
            newnode.next = head;
            head = newnode;
        } else {
            Node current=head;
            int count=1;

            while (current!=null&&count<position-1) {
                current=current.next;
                count++;
            }

            if (current==null) {
                System.out.println("Invalid position");
            }

            newnode.next=current.next;
            current.next=newnode;
        }
    }

    public void displaylist() {
        Node current = head;

        while (current!=null) {
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println();
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }


    public static void main(String[] args) {
        LinkedList1 linkedList=new LinkedList1();

        linkedList.insertAtPos(1, 1);
        linkedList.insertAtPos(2, 2);


        linkedList.displaylist();
    }

}
