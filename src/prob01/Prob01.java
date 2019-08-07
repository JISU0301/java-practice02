package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		int i=50000, sw=0, money, count;
		Scanner sc = new Scanner( System.in  );
		System.out.print( "금액: " );
		money = sc.nextInt();
		
		while(true) {
			count = money/i;
			System.out.printf("%d원 : %d매\n",i,count);
			if(i<=1)
				break;
			money = money - (count*i);
			
			if(sw==0) {
				i=i/5;
				sw=1;
			}else {
				i=i/2;
				sw=0;
			}
		}
 	}
}