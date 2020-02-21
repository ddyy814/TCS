//        Given n doors and n persons. The doors are numbered from 1 to n and persons are given id’s numbered from 1 to n.
//        Each door can have only two statuses ie open (1) or closed (0) . Initially all the doors have status closed.
//                Find the final status of all the doors, when all the persons have changed the status of the doors of
//                which they are authorized. i.e. if status open then change the status to closed and vice versa.
//                A person with id ‘i’ is authorized to change the status of door numbered ‘j’ if ‘j’ is a multiple of ‘i’.
//
//        Note: A person has to change the current status of all the doors for which he is authorized exactly once.
//
//        Example:
//        Input : 3
//        Output : 1 0 0
//
//        Explanation : Initially status of rooms 0 0 0 person with id 2 changes room 2 to open ie (0 1 0) person with
//                id 1 changes room 1, 2, 3 status (1 0 1) person with id 3 changes room 3 status ie (1 0 0)
//
//                Input:
//                The first line of input contains an integer T denoting the no of test cases. Then T test cases follow.
//                Each test case contains an integer n.
//
//                Output:
//                For each test case in a new line print the n space separated integers  either (1 or 0) depending on t
//                he status of the ith door where 1 denotes the door is open and a 0 denotes door is closed.
//
//                Constraints:
//                1 <= T <= 100
//                1 <= N <= 1000
//
//                Example:
//                Input:
//                2
//                3
//                5
//                Output:
//                1 0 0
//                1 0 0 1 0


public class check_if_the_door_open_or_close {
    // check whether or not has even number
    static boolean hasEvenFactor(int n){
        double root_n = Math.sqrt(n);
        if(root_n * root_n == n) return false;
        return true;
    }
    static void printNumber(int n){
        for(int i = 1; i <= n; i++){
            if(hasEvenFactor(i)){
                System.out.print("closed" + " ");
            }else{
                System.out.print("open" + " ");
            }
        }
    }
    public static void main (String[] args) {
        //code
        int n = 5;
        printNumber(n);
    }
}
