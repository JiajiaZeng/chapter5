package chapter_5;

import java.util.Scanner;

public class q5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 10 number: ");
        float sum1=0;
        float sum2=0;
        int i=0;
        while(i<10) {
        	float num=input.nextFloat();
        	sum1+=num;
        	sum2+=Math.pow(num, 2);
        	i++;
        }
        System.out.println("The mean is "+sum1/10);
        System.out.println("The standard deviation is "+Math.sqrt((sum2-Math.pow(sum1, 2)/10)/9));
        input.close();
	}

}
