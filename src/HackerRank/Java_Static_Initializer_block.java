package HackerRank;

import java.util.Scanner;

public class Java_Static_Initializer_block {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    String pass = scan.nextLine();
    static int H = scan.nextInt();
    static boolean flag= true;
    static{
            try {
                if(B<=0||H<=0) {
                    flag = false;
                    throw new Exception("java.lang.Exception: Breadth and height must be positive");
                }
                } catch (Exception e) {
                System.out.print("java.lang.Exception: Breadth and height must be positive");
            }

    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}
