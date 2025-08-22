package Problems.Leetcode;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, n1=0, n2=1, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        n = sc.nextInt();
        System.out.print(n1 + " " + n2 + " ");
        for(int i=2; i<n; i++){
            sum = n1+n2;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
        }
    }
}
