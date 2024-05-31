package assignment_1;

public class Task {
    private String title, description;
    private boolean completed;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }



    public static class Node {
        public Task task;
        public Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public static class ToDoList {
        private Node head;

        public ToDoList() {
            head = null;
        }

        public void addToDO(Task task) {
            Node newNode = new Node(task);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void markToDoAsCompleted(String title) {
            Node current = head;
            while (current != null) {
                if (current.task.getTitle().equals(title)) {
                    current.task.markCompleted();
                    return;
                }
                current = current.next;
            }
            System.out.println("Task not found");
        }

        public void viewToDoList() {
            Node current = head;
            System.out.println("Task List: ");
            while (current != null) {
                System.out.println(current.task);
                current = current.next;
            }
        }

        public static void main(String[] args) {
            ToDoList toDoList = new ToDoList();

            toDoList.addToDO(new Task("Task 1",
                    "Description 1"));
            toDoList.addToDO(new Task("Task 2",
                    "Description 2"));
            toDoList.addToDO(new Task("Task 3",
                    "Description 3"));

            toDoList.markToDoAsCompleted("Task 1");
            toDoList.viewToDoList();


        }
    }
}
