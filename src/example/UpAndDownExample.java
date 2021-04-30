package example;

import java.util.Scanner;

//컴퓨터로부터 제공받은 정수 난수값을 키보드로 입력하여 맞추는 프로그램을 작성하세요.
// => 1~100 범위의 정수 난수값을 제공받도록 작성
// => 난수값을 맞출 수 있는 기회는 10번만 제공되도록 작성
// => 키보드 입력값이 1~100 범위가 아닌 경우 메세지 출력 후 재입력
// => 난수값과 입력값이 같은 경우 입력 횟수 출력 후 프로그램 종료
// => 난수값과 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수값을 10번 안에 맞추지 못한 경우 난수값이 출력되도록 작성
public class UpAndDownExample {
	public static void main(String[] args) {

		Scanner scannerIn = new Scanner(System.in);

		int randomNum = (int) (Math.random() * 100) + 1;
		int lifeCount = 5;
		int selectCount = 0;

		while (true) {
			int input = 0;

			while (true) {
				System.out.print("랜덤값 입력을 통해 맞춰주세요 >> ");
				input = scannerIn.nextInt();
				if (0 < input && input <= 100) {
					++selectCount;
					break;
				}
				System.out.println("잘못 눌렀습니다.");
			}

			if (input == randomNum) {
				System.out.println("정답입니다. 도전 횟수는 ");
				break;
			} else if (input < randomNum) {
				System.out.println("더 큰 값입니다!");
			} else {
				System.out.println("더 작은 값입니다!");
			}
			if (lifeCount <= selectCount) {				//boolean 변수로 하면 좋음!
				System.out.println("맞추지 못했습니다. \n정답은 " + randomNum);
				break;
			}
		}

		scannerIn.close();
	}
}
