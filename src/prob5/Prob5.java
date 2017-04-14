package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		int first_number = 1;
		int last_number = 100;
		int count = 1;
		System.out.println("수를 정하였습니다. 맞춰보세요");
		while (true) {
			System.out.println(first_number + " - " + last_number);

			System.out.print(count + ">>");
			int number = sc.nextInt();
			if (number < k) {
				System.out.println("더 높게");
				first_number = number;
				count++;
			} else if (number > k) {
				System.out.println("더 낮게");
				last_number = number;
				count++;
			} else if (number == k) {
				System.out.println("정답입니다.");
				System.out.print("다시 해 보시겠습니까?(y/n):");
				String check_attempt=sc.next();
				if(check_attempt.equals("y") || check_attempt.equals("Y"))
				{
					k = r.nextInt(100) + 1;
					first_number = 1;
					last_number = 100;
					count = 1;
				}else if(check_attempt.equals("n") || check_attempt.equals("N")){
					System.out.println("수고 많으셨습니다.");
					break;
				}

			} else {
				System.out.println("범위에서 벗어났습니다.");
			}

		}

	}

}