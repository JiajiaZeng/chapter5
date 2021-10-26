package chapter_5;

import java.util.Scanner;

public class q5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个十进制整数：");
        int n=input.nextInt();
        String oct="";
        while(n!=0) {
        	int endN=n%8;
        	oct=endN+oct;
        	n=n/8;
        }
        System.out.println("The octal number is "+oct);
        input.close();
	}

}