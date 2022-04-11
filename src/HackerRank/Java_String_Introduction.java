package HackerRank;

import java.util.Scanner;

public class Java_String_Introduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length()+B.length());

        int size = Math.min(A.length(),B.length());
        int i = 0;
        while(size>0){

            if(A.charAt(i) > B.charAt(i)) {
                System.out.println("Yes");
                break;
            }
            else if (A.charAt(i)<B.charAt(i)) {
                System.out.println("No");
                break;
            }
            else {
                i++;
                size--;
                if(size == 0 && (A.length()<B.length())){
                    System.out.println("No");
                    break;
                }
                else if(size == 0 && (A.length()>B.length())){
                    System.out.println("Yes");
                    break;
                }
                else if (size ==0){
                    System.out.println("No");
                }
            }
        }
        String A1 = A.substring(0,1);
        String A2 = A.substring(1);

        String B1 = B.substring(0,1);
        String B2 = B.substring(1);

        System.out.print(A1.toUpperCase()+A2.toLowerCase() + " " + B1.toUpperCase()+B2.toLowerCase());

    }
}
