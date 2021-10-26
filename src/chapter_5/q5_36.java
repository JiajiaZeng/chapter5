package chapter_5;

import java.util.Scanner;

public class q5_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	        
	        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
	        int num=scan.nextInt();
	        	        
	        int numOri=num;
	        int i=1;
	        int total=0;
	        for(i=1;i<=9;i++) {
	        	total+=(num/(int)Math.pow(10,(9-i)))*i;
	        	num=num%(int)Math.pow(10, (9-i));
	        }
	        int finalNum;
	        finalNum=total%11;
	        if(finalNum==10) {
	        	if(numOri/(int)Math.pow(10, 8)==0) {
	        		System.out.println("The ISBN-10 number is 0"+numOri+"X");
	        	}else {
	        		System.out.println("The ISBN-10 number is "+numOri+"X");
	        	}
	        }else {
	        	if(numOri/(int)Math.pow(10, 8)==0) {
	        		System.out.println("The ISBN-10 number is 0"+numOri+finalNum);
	        	}else {
	        		System.out.println("The ISBN-10 number is "+numOri+finalNum);
	        	}
	        }
	}

}
