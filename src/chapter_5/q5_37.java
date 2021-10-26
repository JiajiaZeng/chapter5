package chapter_5;

import java.util.Scanner;

public class q5_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个十进制整数：");
        int n=input.nextInt();
        String bin="";
        while(n!=0) {
        	int binValue=n%2;
        	bin=binValue+bin;
        	n=n/2;
        }
        System.out.println("The binary number is "+bin);
        input.close();
	}

}
