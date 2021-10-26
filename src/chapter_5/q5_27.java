package chapter_5;

public class q5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year;
        int num=0;
        for (year=101;year<=2100;year++) {
        	if(is_leap_year(year)==1) {
        		System.out.printf(year+" ");
        		num++;
        		if(num%10==0) {
        			System.out.println();
        		}
        	}
        }
        System.out.println();
        System.out.println("Total have : "+num);
	}
    public static int is_leap_year(int year) {
    	if((year%4==0 && year%100!=0) || year%400==0) {
    		return 1;
    	}
    	else return 0;
    }
}
