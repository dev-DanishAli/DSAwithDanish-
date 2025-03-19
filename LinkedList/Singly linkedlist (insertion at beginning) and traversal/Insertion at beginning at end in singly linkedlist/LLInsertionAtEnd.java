class Node{
    int value;
    Node next;

    public Node (int value){
        this.value = value;
    }

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

public class LLInsertionAtEnd{

    Node head;

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null){
            head = newNode;
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public static void main(String[] args) {
        LLInsertionAtEnd list  = new LLInsertionAtEnd();
        list.insertAtEnd(89);
        list.insertAtEnd(55);
        list.insertAtEnd(43);
        list.insertAtEnd(23);


    }
}
