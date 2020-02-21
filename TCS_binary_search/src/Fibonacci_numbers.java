//        Given a number N, print the first N fibonacci numbers.
//
//        Input:
//        The first line of input contains an integer T denoting the number of test cases. Then T test cases follow.
//        The first line of each test case contains the integer N.
//
//        Output:
//        Print the first n fibonacci numbers with a space between each number. Print the answer for each test case in a new line.
//
//        Constraints:
//        1<= T <=100
//        1<= N <=84
//
//        Example:
//        Input:
//        2
//        7
//        5
//
//        Output:
//        1 1 2 3 5 8 13
//        1 1 2 3 5


import java.util.Scanner;

public class Fibonacci_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long f1 = 0, f2 = 1, f3 = 0;
            System.out.print((f1 + f2) + " ");
            for(int i = 1; i < n; i++){
                f3 = f1 + f2;
                System.out.print(f3 + " ");
                f1 = f2;
                f2 = f3;
            }
            System.out.println();
            t--;
        }
    }
}
