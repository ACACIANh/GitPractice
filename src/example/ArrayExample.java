package example;

public class ArrayExample {
	public static void main(String[] args) {
		// ������� ���̸� ������ �迭 ����
		int[] ages = { 27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 69, 51, 39, 33, 11 };

		// �迭�� ����� ������� ��� ���̸� ����Ͽ� ����ϼ���.
		// ex) ��� ���� = 36��

		int sum = 0;
		int average = 0;
		for (int age : ages) {
			sum += age;
		}
		average = sum / ages.length;
		System.out.println("��� ���� = " + average + " ��");
		System.out.println("======================================================");
		// �迭�� ����� ������� ���̸� ���ɺ��� �����Ͽ� �ο����� ����Ͽ� ����ϼ���.
		// ex) 10�� = 3��
		// 20�� = 4��
		// ...
		// 60�� = 2��
		
		int numbers[] = new int[7];
		for (int age : ages) {
			int index = age / 10;
			++numbers[index];
		}
		for (int i = 1; i<numbers.length; ++i) {
			System.out.println( i + "0�� = " + numbers[i] + " ��");
		}
		
		//�� �������� �ϰ�;��....
		System.out.println("======================================================");
	}
}
