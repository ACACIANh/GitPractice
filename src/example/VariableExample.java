package example;

public class VariableExample {
	public static void main(String[] args) {
		//������ ���̰� 7�̰� ������ ���̰� 10�� �簢���� ���̸� ����Ͽ� ����ϼ���
		int horizontal = 7;
		int vertical = 10;
		int rectangle = horizontal * vertical;
		System.out.println("�簢���� ���� = " + rectangle);
		
		//���̰� 9�̰� �غ��� ���̰� 7�� �ﰢ���� ���̸� ����Ͽ� ����ϼ���
		int height = 9;
		int width = 7;
		double triangle = height * width * 0.5;
		System.out.println("�ﰢ���� ���� = " + triangle);
		
		//10�� ��ü �����԰� 759kg�� ��� ��� �����Ը� ����Ͽ� ����ϼ���
		int weight = 759;
		int humanCount = 10;
		double weightAverage = (double)weight / humanCount;
		System.out.println("��� ������ = " + weightAverage);
		
		//�̸��� 'ȫ�浿'�� �л��� ���� 89, ���� 93, ���� 95 �������
		//������ ����� ����Ͽ� �̸�, ����, ����� ����ϼ���
		//�� ����� �Ҽ��� ���ڸ��� ����ϰ� �������� �����ÿ�
		String name = "ȫ�浿";
		int korean = 89;
		int english = 93;
		int math = 95;
		
		int sum = korean + english + math;
		double average = (double)sum / 3;
		//double average = (double)sum / 3;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (int)(average*10) / 10.0);

	}
}
