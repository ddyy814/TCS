//        John was given a task to make a rectangular box during his innovation competition. He was given with
//        the A cm of wire and B cm2 of special paper. He had to use all the wire (for the 12 edges) and paper
//        (for the 6 sides) to make the box. So what will be the maximum volume of that box?
//
//        Input:
//        The first line contains T, the number of test cases.
//        Each test case contains two integers A and B in a line.
//
//        Output:
//        Single lined output for the maximum floored volume of the made box.
//
//        Constraints:
//        1<=T<=100
//        1<=A,B<=106
//        Example:
//
//        Input:
//        2
//        20 14
//        20 16
//
//        Output:
//        3
//        4

import java.util.Scanner;

public class Max_volume_ofA_rec_box {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            Double p=sc.nextDouble();
            Double s=sc.nextDouble();
            Double l,b;
            b=p-Math.sqrt(p*p-24*s);
            b=b/12;
            l=p/4-2*b;
            Double d=new Double(l*b*b);
            int total=d.intValue();
            System.out.println(total);
            t--;
        }
    }
}
