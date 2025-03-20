class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

public class Linkedlist {
    Node head;

    public void insertAtAnyPoint(int value, int position) {
        Node newNode = new Node(value);


        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insertAtAnyPoint(45, 0);
        list.insertAtAnyPoint(24, 1);
        list.insertAtAnyPoint(56, 1);
        list.insertAtAnyPoint(34, 3);
        list.insertAtAnyPoint(75, 4);
        list.insertAtAnyPoint(89, 2);

        list.display();
    }
}
