package example;

import java.util.Scanner;

//��ǻ�ͷκ��� �������� ���� �������� Ű����� �Է��Ͽ� ���ߴ� ���α׷��� �ۼ��ϼ���.
// => 1~100 ������ ���� �������� �����޵��� �ۼ�
// => �������� ���� �� �ִ� ��ȸ�� 10���� �����ǵ��� �ۼ�
// => Ű���� �Է°��� 1~100 ������ �ƴ� ��� �޼��� ��� �� ���Է�
// => �������� �Է°��� ���� ��� �Է� Ƚ�� ��� �� ���α׷� ����
// => �������� �Է°��� �ٸ� ��� "ū�� �Է�" �Ǵ� "������ �Է�" ������ �޼��� ���
// => �������� 10�� �ȿ� ������ ���� ��� �������� ��µǵ��� �ۼ�
public class UpAndDownExample {
	public static void main(String[] args) {

		Scanner scannerIn = new Scanner(System.in);

		int randomNum = (int) (Math.random() * 100) + 1;
		int lifeCount = 5;
		int selectCount = 0;

		while (true) {
			int input = 0;

			while (true) {
				System.out.print("������ �Է��� ���� �����ּ��� >> ");
				input = scannerIn.nextInt();
				if (0 < input && input <= 100) {
					++selectCount;
					break;
				}
				System.out.println("�߸� �������ϴ�.");
			}

			if (input == randomNum) {
				System.out.println("�����Դϴ�. ���� Ƚ���� ");
				break;
			} else if (input < randomNum) {
				System.out.println("�� ū ���Դϴ�!");
			} else {
				System.out.println("�� ���� ���Դϴ�!");
			}
			if (lifeCount <= selectCount) {				//boolean ������ �ϸ� ����!
				System.out.println("������ ���߽��ϴ�. \n������ " + randomNum);
				break;
			}
		}

		scannerIn.close();
	}
}
