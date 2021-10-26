package chapter_5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat two=new DecimalFormat("#.00");//����2λС��

		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double LoanAmount=input.nextDouble();		
		System.out.print("Number of Years: ");
		double Years=input.nextDouble();		
		System.out.print("Annual Interest Rate: ");
		double Rate=input.nextDouble();
		System.out.println();
		//��֧�����������������Ϣ
    	double monthlyPayment=LoanAmount*(Rate/1200)/(1-1/Math.pow(1+Rate/1200,Years*12));
		double totalPayment=monthlyPayment*Years*12;
		System.out.println("Monthly Payment: "+two.format(monthlyPayment));
		System.out.println("Total Payment: "+two.format(totalPayment));
		System.out.println();
		System.out.println("Payment#        Interest        Principal       Balance");
		double balance=LoanAmount;//��ʼʱ�������Ǵ����ܶ�
    	for (int i=1;i<=Years*12;i++) {
			double interest=(Rate/1200)*balance;//��Ϣ=������*��ʣ�౾��
			double principal=monthlyPayment-interest;//��������
		    balance=balance-principal;//���
		    System.out.println(i+"\t\t"+two.format(interest)+"\t\t"+two.format(principal)+"\t\t"+two.format(balance));
		}
	}

}
