package chapter_5;

import java.text.DecimalFormat;

public class q5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double tuition=10000;
        double rate=0.05;
        double tuitionTenyearslater=tuition*Math.pow(1+rate, 10);
        DecimalFormat d=new DecimalFormat("#.#");//保留一位小数
        System.out.println("The tuition fee in ten years is: $"+d.format(tuitionTenyearslater));
        int i;
        double tuitionFouryearstotal=0;
        for(i=10;i<=13;i++) {
        	tuitionFouryearstotal+=tuition*Math.pow(1+rate, i);
        }
        System.out.println("Ten years from now, the total tuition fee for four years is: $"+d.format(tuitionFouryearstotal));
	}

}
