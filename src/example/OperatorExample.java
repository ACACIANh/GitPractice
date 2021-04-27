package example;

public class OperatorExample {
	public static void main(String[] args) {
		//245678초를 일시분초 형식으로 변환하여 출력하세요.
		int time = 245678;
		int hour;
		int miniute;
		int second;
		
		second = time % 60;
		time /= 60;
		miniute = time % 60;
		time /= 60;
		hour = time % 60;
		System.out.println(hour + " 시 " + miniute + " 분 " + second + " 초 ");
		System.out.println("===============================================");
		
		//한대의 가격이 1억 5천원만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 
		//출력하세요. 
		//단, 15대 이상 구매할 경우 1대당 25%의 할인율을 적용하여 계산하세요. 
		double price = 150_000_000;
		int count = 20;
		double cost = price * count;

		if(count >= 15) {
			int saleCount = count - 15;
			cost -= price * saleCount * 0.25;
		}
		
		//3항 연산자를 이용할 경우
		System.out.println( 
				(count < 15 ? price * count : price * 15 + price * (count - 15) * 0.75)
						+ " 원 입니다.");
		
		System.out.println(cost + " 원 입니다.");
		System.out.println("===============================================");
	}
}
