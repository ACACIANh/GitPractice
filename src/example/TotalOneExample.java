package example;

import java.util.Scanner;

//Ű����� ������ 5���� �Է¹޾� �հ踦 ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) 1��° ������ �Է� >> 10
//    2��° ������ �Է� >> 20
//    3��° ������ �Է� >> 30
//    4��° ������ �Է� >> 40
//    5��° ������ �Է� >> 50
//    [���]�հ� = 150
public class TotalOneExample {
	public static void main(String[] args) {

		Scanner scannerIn = new Scanner(System.in);

		int sum = 0;
		int count = 5;

		for (int i = 0; i < count; ++i) {
			System.out.print((i + 1) + "��° ������ �Է� >> ");
			int input = scannerIn.nextInt();
			sum += input;
		}

		System.out.print("[���] �հ� = " + sum);
		scannerIn.close();
	}
}
