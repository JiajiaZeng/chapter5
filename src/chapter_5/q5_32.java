package chapter_5;

import java.util.Scanner;

public class q5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int lottery1=(int)(Math.random()*10);
        int lottery2=(int)(Math.random()*10);
        while(lottery2==lottery1) {
        	lottery2=(int)(Math.random()*10);
        }
        int lottery=lottery1*10+lottery2;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your lottery pick(two digits): ");
        int guess=input.nextInt();
        
        int guessDigit1=guess/10;
        int guessDigit2=guess%10;
        
        if(lottery1==0) {
        	System.out.println("The lottery number is "+"0"+lottery);
        }
        else {
        	System.out.println("The lottery number is "+lottery);
        }
        
        if(guess==lottery) {
        	System.out.println("Exact match: you win $10000");
        }
        else if(guessDigit2==lottery1 && guessDigit1==lottery2) {
        	System.out.println("Exact match: you win $3000");
        }
        else if(guessDigit1==lottery1
        	 || guessDigit1==lottery2
        	 || guessDigit2==lottery1
        	 || guessDigit2==lottery2) {
        	System.out.println("Exact match: you win $1000");
        }
        else {
        	System.out.println("Sorry,no match");
        }
        
        input.close();
	}

}
