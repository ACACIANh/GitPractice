package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678�ʸ� �Ͻú��� �������� ��ȯ�Ͽ� ����ϼ���.
		int time = 245678;
		int hour;
		int miniute;
		int second;
		
		second = time % 60;
		time /= 60;
		miniute = time % 60;
		time /= 60;
		hour = time % 60;
		System.out.println(hour + " �� " + miniute + " �� " + second + " �� ");
		System.out.println("===============================================");
		
		//�Ѵ��� ������ 1�� 5õ������ ����⸦ 20�� ������ ��� �����ؾߵ� �ݾ��� ����Ͽ� 
		//����ϼ���. 
		//��, 15�� �̻� ������ ��� 1��� 25%�� �������� �����Ͽ� ����ϼ���. 
		double price = 150_000_000;
		int count = 20;
		double cost = price * count;

		if(count >= 15) {
			int saleCount = count - 15;
			cost -= price * saleCount * 0.25;
		}
		
		//3�� �����ڸ� �̿��� ���
		System.out.println( 
				(count < 15 ? price * count : price * 15 + price * (count - 15) * 0.75)
						+ " �� �Դϴ�.");
		
		System.out.println(cost + " �� �Դϴ�.");
		System.out.println("===============================================");
	}
}
