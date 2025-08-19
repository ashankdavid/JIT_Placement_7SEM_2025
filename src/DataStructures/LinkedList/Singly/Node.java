package DataStructures.LinkedList.Singly;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SLL{
    Node head;
    SLL(){
        head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void insertAtTail(int val){

    }


    void printList(){
        Node temp = head;

        while(temp.next!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class DriverCode{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.insertAtHead(50);
        sll.printList();
    }
}
