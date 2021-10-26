package chapter_5;

import java.util.Scanner;

public class q5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter an integer from 1 to 15: ");
        int n=input.nextInt();
        int i,j;
        for(i=1;i<=n;i++) {
        	for(j=1;j<=n*2-1;j++) {
        		if(Math.abs(j-n)>=i) {
        			System.out.print("   ");
        		}
        		else {
        			System.out.printf("%3d",Math.abs(j-n)+1);//printf可以用来格式化输出几位
        		}        		
        	}
        	
        	System.out.println();
        }
        input.close();
	}

}
