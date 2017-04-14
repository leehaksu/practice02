package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int [] money={50000,10000,5000,1000,500,100,50,10,5,1};
		
		System.out.println("금액을 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int total_money = sc.nextInt();
		
		for(int i =0;i<money.length;i++)
		{
			int count = total_money/money[i];
			System.out.println(money[i]+"원 : " + count+"개");
			total_money=total_money-(count*money[i]);
		}
		
		
	}
}