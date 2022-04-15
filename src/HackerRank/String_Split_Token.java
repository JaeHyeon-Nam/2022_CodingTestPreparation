package HackerRank;

import java.util.Scanner;

public class String_Split_Token {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s= s.trim();
        String[] s1 = s.split("[ !,?._'@]+");
        if(s1.length==1 && s1[0].equals("")){
            System.out.print("0");

        }
        else {
            System.out.println(s1.length);
            for (String value : s1) {
                System.out.println(value);
            }
        }
    }
}