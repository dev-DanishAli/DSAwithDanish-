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

public class LinkedList{

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insertAtbeginning(int value) {
    Node node = new Node(value);
    node.next = head;
    head = node;

    if (tail == null){
        tail = head;
    }
    size += 1;
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
        LinkedList list  = new LinkedList();
        list.insertAtbeginning(32);
        list.insertAtbeginning(43);
        list.insertAtbeginning(66);
        list.insertAtbeginning(99);

        list.display();
    }
}