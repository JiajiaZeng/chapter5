package chapter_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat thr=new DecimalFormat("#.000");//保留3位小数
		DecimalFormat two=new DecimalFormat("#.00");//保留2位小数
        Scanner input=new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double money=input.nextDouble();
        System.out.print("Number of Years: ");
        int years=input.nextInt();
        System.out.println("Interest Rate     Monthly Payment     Total Payment");
        for(double i=5;i<=8;i=i+0.125) {
        	double monthlyRate=i/1200;
        	double monthlyPayment=money*monthlyRate/(1-1/Math.pow(1+monthlyRate,years*12));
    		double totalPayment=monthlyPayment*years*12;
        	System.out.print(thr.format(i)+"%"+"            ");
        	System.out.print(two.format(monthlyPayment)+"              ");
        	System.out.print(two.format(totalPayment)+"     ");
        	System.out.println();
        }
        input.close();
	}

}
