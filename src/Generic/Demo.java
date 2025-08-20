package Generic;

import java.util.ArrayList;

public class Demo<T> {
    T attribute1;
    T attribute2;

    public static void main(String[] args) {
        Demo<Integer> obj1 = new Demo<>();
        Demo<Character> obj2 = new Demo<>();
    }
}
