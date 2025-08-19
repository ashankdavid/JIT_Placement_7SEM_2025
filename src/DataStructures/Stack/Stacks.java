package DataStructures.Stack;

public class Stacks {
    int[] arr;
    int top;
    int size;

    Stacks(int size){
        this.size = size;
        arr = new int[size];  // arr = (int)malloc(sizeof(int))
        top = -1;
    }

    void push(int val){
        if(top==size-1){
            System.out.println("Overflow");
            return ;
        }
        top++;
        arr[top] = val;
    }

    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return ;
        }
        top--;
    }

    int Top(){
        if(top==-1){
            System.out.println("Underflow");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        return top==-1;
    }
}

class Driver{
    public static void main(String[] args) {
        Stacks st = new Stacks(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
        st.pop();
    }
}
