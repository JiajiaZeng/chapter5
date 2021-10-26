package chapter_5;

import java.util.Scanner;

public class q5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("Please enter an integer from 1 to 15: ");
        int n=input.nextInt();
        int i,j;
        for(i=1;i<=n;i++) {
        	for(j=1;j<=2*n-1;j++) {
        		if(Math.abs(j-n)>=i) {
        			System.out.print("      ");
        		}
        		else {
        			double num=Math.pow(2,i-Math.abs(j-n)-1);
        			int number=(int)num;
        			System.out.printf("%6d",number);
        		} 
        	}
        	System.out.println();
        }
        input.close();
	}

}
