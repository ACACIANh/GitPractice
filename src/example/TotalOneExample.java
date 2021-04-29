package example;

import java.util.Scanner;

//키보드로 정수값 5개를 입력받아 합계를 계산하여 출력하는 프로그램을 작성하세요.
//ex) 1번째 정수값 입력 >> 10
//    2번째 정수값 입력 >> 20
//    3번째 정수값 입력 >> 30
//    4번째 정수값 입력 >> 40
//    5번째 정수값 입력 >> 50
//    [결과]합계 = 150
public class TotalOneExample {
	public static void main(String[] args) {

		Scanner scannerIn = new Scanner(System.in);

		int sum = 0;
		int count = 5;

		for (int i = 0; i < count; ++i) {
			System.out.print((i + 1) + "번째 정수값 입력 >> ");
			int input = scannerIn.nextInt();
			sum += input;
		}

		System.out.print("[결과] 합계 = " + sum);
		scannerIn.close();
	}
}
