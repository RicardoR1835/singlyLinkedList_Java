// package ListAssignment;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.copy
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove() {
        if(head == null) {
            System.out.println("List does not exist");
        } else {
            Node runner = head;
            while(runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }
    public void printValues() {
        if(head == null) {
            System.out.println("List does not exist");
        }
        Node runner = head;
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    public void find(int node) {
        if(head == null) {
            System.out.println("List does not exist");
        } else {
            Node runner = head;
            if(runner.value == node) {
                System.out.println("Head matches position 1");
            }
            Boolean y = false;
            int position = 1;
            while(runner != null) {
                if(runner.value == node) {
                    System.out.println("Value matches at position: " + position);
                    y = true;
                    break;
                } else {
                    runner = runner.next;
                    position++;
                }
            }
            if (y == false) {
                System.out.println("Value not found");
            }
        }
    }
    public void removeAt(int position) {
        if(head == null) {
            System.out.println("List does not exist");
        } else {
            int count = 1;
            Node runner = head;
            while(count < position - 1) {
                runner = runner.next;
                count++;
            }
            Node current = runner.next;
            runner.next = current.next;
            current.next = null;
            System.out.println(runner.value);
        }
    }  
}