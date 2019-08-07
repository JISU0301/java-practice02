package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		int minNumber = 1;
		int maxNumber = 100;
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber) + minNumber;
		int input = 0;
		while(true) {
			
			input = scanner.nextInt();
			
			if(input==correctNumber) {
				System.out.println("맞았습니다.");
				System.out.println("다시 하시겠습니까??");
				String answer = scanner.next();
				if(answer.equals("n")) {
					System.out.println("종료합니다.");
					System.exit(0);
				}
				if(answer.equals("y")) {
					correctNumber = random.nextInt(maxNumber) + minNumber;
					continue;
				}
			}else if(input > correctNumber) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(input < correctNumber) {
				System.out.println("더 큰 수를 입력하세요.");
			}
		//정답 랜덤 만들기
		
		
		
		}
		
	
	}

}