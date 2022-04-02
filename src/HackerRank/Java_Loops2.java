package HackerRank;

import java.util.Scanner;

public class Java_Loops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int k = 0;
            for( int j =0;j<n;j++){
                k+=(Math.pow(2,j))*b;

                System.out.print((a+k)+" ");

            }
            System.out.println();
        }
        in.close();
    }
}
