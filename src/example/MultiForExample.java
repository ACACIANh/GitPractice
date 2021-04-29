package example;

import java.util.Scanner;

public class MultiForExample {
	public static void main(String[] args) {
		// ¡Ú¡Ú¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú
		// ¡Ú¡Ú
		// ¡Ú
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (i <= j) {
					System.out.print("¡Ú");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		// ¡Ú¡Ú¡Ú¡Ú¡Ú
		// ¡Ù¡Ú¡Ú¡Ú¡Ú
		// ¡Ù¡Ù¡Ú¡Ú¡Ú
		// ¡Ù¡Ù¡Ù¡Ú¡Ú
		// ¡Ù¡Ù¡Ù¡Ù¡Ú
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if (i <= j) {
					System.out.print("¡Ú");
				} else {
					System.out.print("¡Ù");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		// ¡Ú
		// ¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		// ¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú¡Ú
		for (int i = 0; i < 5; ++i) {
			System.out.print("¡Ú");
			for (int j = 0; j < 2 * i; ++j) {
				System.out.print("¡Ú");
			}
			System.out.println("");
		}
		System.out.println("");

		// ¡Ú¡Ù¡Ù¡Ù¡Ú
		// ¡Ù¡Ú¡Ù¡Ú¡Ù
		// ¡Ù¡Ù¡Ú¡Ù¡Ù
		// ¡Ù¡Ú¡Ù¡Ú¡Ù
		// ¡Ú¡Ù¡Ù¡Ù¡Ú
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < 5; ++j) {
				if ((i + j) % 4 == 0 || (i == j)) {
					System.out.print("¡Ú");
				} else {
					System.out.print("¡Ù");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		
		Scanner sc = new Scanner(System.in);

	}
}
