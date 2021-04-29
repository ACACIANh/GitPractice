package example;

import java.util.Scanner;

//키보드로 정수값을 입력받아 1~9 범위의 정수값을 곱한 결과를 출력하는 프로그램을 작성하세요.
//단,입력된 정수값은 2~9 범위의 정수값만 허용되며 범위 밖의 정수값을 입력한 경우 메세지 출력 후 재입력
//ex) 단 입력[2~9] >> 7
//    7 * 1 = 7
//    7 * 2 = 14
//    ...
//    7 * 8 = 56
//    7 * 9 = 63
public class GugudanExmaple {
	public static void main(String[] args) {

		Scanner scannerIn = new Scanner(System.in);
		int input;

		while (true) {
			System.out.print("단 입력[2~9] >> ");
			input = scannerIn.nextInt();
			if (1 < input && input < 10) {
				break;
			}
			System.out.println("다시 입력하세요 ");
		}

		for (int i = 0; i < 9; ++i) {
			System.out.println(input + " * " + (i + 1) + " = " + input * (i + 1));
		}

		scannerIn.close();

	}
}
