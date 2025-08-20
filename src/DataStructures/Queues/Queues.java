package DataStructures.Queues;

public class Queues {
    int[] arr;
    int front;
    int back;
    int sizeQ;

    Queues(int sizeQ){
        this.sizeQ = sizeQ;
        arr = new int[sizeQ];
        front = -1;
        back = -1;
    }

    void push(int val){
        if(back==sizeQ-1){
            System.out.println("Overflown");
            return;
        }
        back++;
        arr[back] = val;
        if(front==-1){
            front++;
        }
    }

    void pop(){
        if(front==-1 || front > back){
            System.out.println("Underflown");
            return ;
        }
        front++;
    }

    int peek(){
        if(front==-1 || front > back){
            System.out.println("Underflown");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty(){
        return (front==-1 || front>back);
    }
}

class DriverCode{
    public static void main(String[] args) {
        Queues q = new Queues(10);
    }
}
