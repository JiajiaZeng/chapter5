package chapter_5;

public class q5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		int sum;
		for (i=1;i<=10000;i++) {
			sum=0;
			for(j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		
		
	}

}
