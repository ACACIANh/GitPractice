package example;

import java.text.DecimalFormat;

public class OperatorExample {
	public static void main(String[] args) {
		//245678�ʸ� �Ͻú��� �������� ��ȯ�Ͽ� ����ϼ���.
		int time = 245678;
		int day;
		int hour;
		int miniute;
		int second;
		
		second = time % 60;
		time /= 60;
		miniute = time % 60;
		time /= 60;
		hour = time % 24;
		time /= 24;
		day = time;
		
		System.out.println(day + " �� " + hour + " �� " + miniute + " �� " + second + " �� ");
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
		
		DecimalFormat df = new DecimalFormat("#.#E0");
		String result = df.format(cost);

		System.out.println(result + " �� �Դϴ�.");
		
		double cost2 = price * count;
		if(count >= 15) {
			cost2 -= price * count * 0.25;
		}
		System.out.println(cost2);

		System.out.println("===============================================");
	}
}
