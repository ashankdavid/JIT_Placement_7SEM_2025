package Problems.Leetcode;

import java.util.Scanner;

public class FibRec {
    static int fib(int x){
        if(x==0 || x== 1){
            return x;
        }
        return fib(x-1) + fib(x-2);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
