package HackerRank;

import java.util.Scanner;

public class Java_output_Formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            s1 = String.format("%-15s",s1);
            // - : 오른쪽을 채우는 것
            // 15 : 15자리수 만큼.
            String x1;
            x1 = String.format("%03d",x);
            // % : 명령 시작
            // 0 : 채워질 문자
            // 3 : 총 자리수
            // d : 십진수로 된 정수
            System.out.println(s1 + x1);
        }
        System.out.println("================================");

    }
}
