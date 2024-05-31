package assignment_2;


    public class Stack {

        private Node top;

        public Stack() {
            top = null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }

            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            }

            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        private class Node {
            private int data;
            private Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void main(String[] args) {
            Stack stack = new Stack();

            stack.push(13);
            stack.push(9);
            stack.push(7);

            System.out.println("Peek: " + stack.peek());

            System.out.println("Pop: " + stack.pop());
            System.out.println("Pop: " + stack.pop());

            stack.push(4);

            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());

            System.out.println("Is stack empty? " + stack.isEmpty());

            System.out.println("Pop: " + stack.pop());
            System.out.println("Is stack empty? " + stack.isEmpty());
        }

}
