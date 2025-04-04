class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}

public class Linkedlist {
    Node head;

    public void addAtBeginning(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void deleteNode(int value){
        Node temp = head;

        while (temp.next != null && temp.next.value != value){
            temp = temp.next;
        }

        if (temp.next != null){
            temp.next = temp.next.next;
        }
    }

    public void displayList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
    Linkedlist list = new Linkedlist();

    list.addAtBeginning(63);
    list.addAtBeginning(23);
    list.addAtBeginning(34);
    list.addAtBeginning(24);

        System.out.println("List Before Deletion: ");
        list.displayList();

    list.deleteNode(23);

        System.out.println("List After Deletion: ");
        list.displayList();
    }
}