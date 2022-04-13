package HackerRank;

import java.util.Scanner;

public class Java_String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int len=A.length();
        for(int i =0, j = len-1;i<len/2;i++,j--){
            if(A.charAt(i) != A.charAt(j))
            {
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}
