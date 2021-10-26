package chapter_5;

public class q5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        for(i=10000;i<=100000;i=i+10000) {
        	System.out.println(getPI(i));
        }
	}
	public static double getPI(int i) {    //ÇóPI
		int k;
		double PI=0;
		for(k=1;k<=i;k++) {
			PI+=Math.pow(-1, k-1)/(2*k-1);
		}
	    return PI*4;
	}
}
