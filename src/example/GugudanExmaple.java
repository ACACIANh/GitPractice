package example;

import java.util.Scanner;

//Ű����� �������� �Է¹޾� 1~9 ������ �������� ���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��,�Էµ� �������� 2~9 ������ �������� ���Ǹ� ���� ���� �������� �Է��� ��� �޼��� ��� �� ���Է�
//ex) �� �Է�[2~9] >> 7
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
			System.out.print("�� �Է�[2~9] >> ");
			input = scannerIn.nextInt();
			if (1 < input && input < 10) {
				break;
			}
			System.out.println("�ٽ� �Է��ϼ��� ");
		}

		for (int i = 0; i < 9; ++i) {
			System.out.println(input + " * " + (i + 1) + " = " + input * (i + 1));
		}

		scannerIn.close();

	}
}
