package example;

import java.util.Scanner;

public class MultiForExample {
	public static void main(String[] args) {
		// �ڡڡڡڡ�
		// �ڡڡڡ�
		// �ڡڡ�
		// �ڡ�
		// ��
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (i <= j) {
					System.out.print("��");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		// �ڡڡڡڡ�
		// �١ڡڡڡ�
		// �١١ڡڡ�
		// �١١١ڡ�
		// �١١١١�
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (i <= j) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		// ��
		// �ڡڡ�
		// �ڡڡڡڡ�
		// �ڡڡڡڡڡڡ�
		// �ڡڡڡڡڡڡڡڡ�
		for (int i = 0; i < 5; ++i) {
			System.out.print("��");
			for (int j = 0; j < 2 * i; ++j) {
				System.out.print("��");
			}
			System.out.println("");
		}
		System.out.println("");

		// �ڡ١١١�
		// �١ڡ١ڡ�
		// �١١ڡ١�
		// �١ڡ١ڡ�
		// �ڡ١١١�
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if ((i + j) % 4 == 0 || (i == j)) {
					System.out.print("��");
				} else {
					System.out.print("��");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		
		Scanner sc = new Scanner(System.in);

	}
}
