package HackerRank;

import java.util.Scanner;

public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toUpperCase();
        b = b.toUpperCase();
        if(a.length() != b.length()) return false;
        else{
            String sub1 = b;
            String sub2;
            for(int i=0;i<a.length();i++){
                boolean not_in_sentence = false;
                for(int j=0;j<a.length()-i;j++){

                    if(a.charAt(i) == sub1.charAt(j)){
                        if(j==0) {
                            sub1 = sub1.substring(1,a.length()-i);
                        }
                        else{

                            sub2 = sub1.substring(j+1);
                            sub1 = sub1.substring(0,j);
                            sub1 +=sub2;
                        }
                        not_in_sentence = true;
                        break;
                    }
                }

                if(!not_in_sentence) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
