package chapter_5;


public class q5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        double sum=1;
        for (i=10000;i<=100000;i=i+10000) {
        	for (j=1;j<=i;j++) {
        		sum=sum+getE(j);        		
        	}
        	System.out.println(sum);
        }
	}
    public static double getE(int i) {
    	double item=1;
    	while(i>=1) {
    		item=item*i;
    		i--;
    	}
    	return 1/item;
    }
}
