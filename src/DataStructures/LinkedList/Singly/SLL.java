package DataStructures.LinkedList.Singly;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    SLL() {
        head = null;
    }

    void insertAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void insertAtTail(int val) {
        Node n = new Node(val);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    int getSizeLL() {
        int sizeLL = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sizeLL++;
        }
        return sizeLL;
    }

    void insertAtPos(int pos, int val) {
        int sizeLL = getSizeLL();
        Node n = new Node(val);
        if (pos < 0 || pos > sizeLL) {
            System.out.println("Invalid Position");
        } else if (pos == 0) {
            n.next = head;
            head = n;
        } else {
            Node temp = head;
            while (--pos > 0) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }

    void deleteHead() {
        if (head == null) {
            System.out.println("Nothing is there to Delete!");
            return;
        }
        Node toDelete = head;
        head = head.next;
        toDelete = null; // this will call garbage collection on head node deleting the head node!
    }

    void deleteByVal(int val) {
        if (head == null) return;

        if (head.data == val) {
            deleteHead();
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Val not Found");
            return;
        }

        Node toDelete = temp.next;
        temp.next = temp.next.next;
        toDelete = null;
    }

    void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class DriverCode{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtTail(60);
        sll.printList();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.insertAtHead(50);
        sll.printList();
        sll.insertAtPos(3, 100);
        sll.printList();
        sll.deleteHead();
        sll.printList();
        sll.deleteByVal(30);
        sll.printList();
    }
}
