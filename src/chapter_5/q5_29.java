package chapter_5;

import java.util.Scanner;

public class q5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the year: ");
        int year=input.nextInt();        
        System.out.print("Please enter the day of the week when the first day of the year is (0:Sun,1:Mon,2:Tue,3:Wed,4:Thu,5:Fri,6:Sat): ");
        int week=input.nextInt();
        int month;
        int day;
        int i,j;
        for(month=1;month<=12;month++) {
        	if(month==1) {
        		day=31;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==2){
        		if(is_leap_year(year)==1) {//ÅÐ¶ÏÊÇ·ñÈòÄê
        			day=29;
        		}
        		else {
        			day=28;
        		}
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==3){
        		day=31;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==4){
        		day=30;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==5){
        		day=31;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==6){
        		day=30;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==7){
        		day=31;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==8){
        		day=31;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==9){
        		day=30;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==10){
        		day=31;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else if(month==11){
        		day=30;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        	else {
        		day=31;
        		System.out.println("\t\t  January "+year+"\t\t\n"+"-----------------------------------------------------");
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
        input.close();
	}
	
	public static int is_leap_year(int year) {
    	if((year%4==0 && year%100!=0) || year%400==0) {
    		return 1;
    	}
    	else return 0;
    }

}
