package HackerRank;

import java.util.Scanner;

public class Java_End_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNext()){
            String str = scan.nextLine();
            System.out.print(i +" "+str);
            if(scan.hasNext()) {
                System.out.println();
                i++;
            }
        }


    }
}
