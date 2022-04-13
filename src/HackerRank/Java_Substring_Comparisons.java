package HackerRank;

import java.util.Scanner;

public class Java_Substring_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i =0;i<s.length()-k+1;i++){
            String subs;
            subs = s.substring(i,i+k);

            if(smallest.equals("") && largest.equals("")){
                smallest = subs;
                largest = subs;
                continue;
            }

            if(smallest!=""){
                for(int j =0; j<k;j++) {
                    if (smallest.charAt(j)<subs.charAt(j)){
                        break;
                    }
                    else if(smallest.charAt(j)==subs.charAt(j)){
                        continue;
                    }
                    else if(smallest.charAt(j)>subs.charAt(j)){
                        smallest = subs;
                        break;
                    }
                }
            }
            if(largest !=""){
                for(int j =0; j<k;j++) {
                    if (largest.charAt(j)>subs.charAt(j)){
                        break;
                    }
                    else if(largest.charAt(j)==subs.charAt(j)){
                        continue;
                    }
                    else if(largest.charAt(j)<subs.charAt(j)){
                        largest = subs;
                        break;
                    }
                }
            }

        }

        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
