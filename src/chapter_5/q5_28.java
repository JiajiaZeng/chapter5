package chapter_5;

import java.util.Scanner;

public class q5_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the year: ");
		int year=input.nextInt();
		int month;
		
		for(month=1;month<=12;month++) {
			switch(month) {
			case 1:System.out.println("January 1, "+year+getDay(year,month));break;
			case 2:System.out.println("February 1, "+year+getDay(year,month));break;
			case 3:System.out.println("March 1, "+year+getDay(year,month));break;
			case 4:System.out.println("April 1, "+year+getDay(year,month));break;
			case 5:System.out.println("May 1, "+year+getDay(year,month));break;
			case 6:System.out.println("June 1, "+year+getDay(year,month));break;
			case 7:System.out.println("July 1, "+year+getDay(year,month));break;
			case 8:System.out.println("August 1, "+year+getDay(year,month));break;
			case 9:System.out.println("September 1, "+year+getDay(year,month));break;
			case 10:System.out.println("October 1, "+year+getDay(year,month));break;
			case 11:System.out.println("November 1, "+year+getDay(year,month));break;
			case 12:System.out.println("December 1, "+year+getDay(year,month));break;
			}
		}
		input.close();
	}
	public static String getDay(int year,int month) {
		
		int day=1;
	    int q=day;
	    int m;
	    
	    if(month==1) {
	    	m=13;year=year-1;
	    }
	    else if(month==2) {
	    	m=14;year=year-1;
	    }
	    else {
	    	m=month;
	    }
	    int j=year/100;
	    int k=year%100;
	    int h;
	    h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
	    if(h==0) {
	    	return " is Saturday";//(" is Saturday")
	    }
	    else if(h==1) {
	    	return " is Sunday";//(" is Sunday")
	    }
	    else if(h==2) {
	    	return " is Monday";//(" is Monday")
	    }
	    else if(h==3) {
	    	return " is Tuesday";//(" is Tuesday")
	    }
	    else if(h==4) {
	    	return " is Wednesday";//(" is Wednesday")
	    }
	    else if(h==5) {
	    	return " is Thursday";//(" is Thursday")
	    }
	    else {
	    	return " is Friday";//(" is Friday")
	    }
	}
}
