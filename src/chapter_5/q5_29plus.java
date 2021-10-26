package chapter_5;

import java.util.Scanner;

public class q5_29plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year=input.nextInt();        
        System.out.print("Please enter the day of the week when the first day of the year is (0:Sun,1:Mon,2:Tue,3:Wed,4:Thu,5:Fri,6:Sat): ");
        int week=input.nextInt();
        int month;
        int day;
        int i=0;
        int j=week;
		for(month=1;month<=12;month++) {
        	if(month==1) {
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=31;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==2){
        		System.out.println("\t\t  February "+year+"\t\t\n"+"-----------------------------------------------------");
        		if(is_leap_year(year)==1) {//ÅÐ¶ÏÊÇ·ñÈòÄê
        			day=29;
        		}
        		else {
        			day=28;
        		}
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==3){
        		System.out.println("\t\t  March "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=31;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==4){
        		System.out.println("\t\t  April "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=30;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==5){
        		System.out.println("\t\t  May "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=31;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==6){
        		System.out.println("\t\t  June "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=30;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==7){
        		System.out.println("\t\t  July "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=31;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==8){
        		System.out.println("\t\t  August "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=31;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==9){
        		System.out.println("\t\t  September "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=30;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==10){
        		System.out.println("\t\t  October "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=31;
        		dayPrint(year,i,week,j,day);
        	}
        	else if(month==11){
        		System.out.println("\t\t  November "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=30;
        		dayPrint(year,i,week,j,day);
        	}
        	else {
        		System.out.println("\t\t  December "+year+"\t\t\n"+"-----------------------------------------------------");
        		day=31;
        		dayPrint(year,i,week,j,day);
        	}
        }
        input.close();
	}

	public static int is_leap_year(int year) {
    	if((year%4==0 && year%100!=0) || year%400==0) {
    		return 1;
    	}
    	else return 0;
    }
	
	public static void dayPrint(int year,int i,int week,int j,int day) {
		
		System.out.println("    Sun    Mon    Tue    Wed    Thu    Fri    Sat    ");
		for(i=0;i<week;i++) {
			System.out.print("       ");
		}
		for(j=week;j<=day+week-1;j++) {
			System.out.printf("%7d",j-week+1);
			if((j+1)%7==0) {
				System.out.println();
			}
		}
		week=j%7;
		System.out.println();
		System.out.println();
	}
}
