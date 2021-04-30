package example;

public class ArrayExample {
	public static void main(String[] args) {
		// 사람들의 나이를 저장한 배열 선언
		int[] ages = { 27, 16, 22, 36, 57, 60, 43, 23, 14, 29, 44, 52, 69, 51, 39, 33, 11 };

		// 배열에 저장된 사람들의 평균 나이를 계산하여 출력하세요.
		// ex) 평균 나이 = 36살

		int sum = 0;
		int average = 0;
		for (int age : ages) {
			sum += age;
		}
		average = sum / ages.length;
		System.out.println("평균 나이 = " + average + " 살");
		System.out.println("======================================================");
		// 배열에 저장된 사람들의 나이를 연령별로 구분하여 인원수를 계산하여 출력하세요.
		// ex) 10대 = 3명
		// 20대 = 4명
		// ...
		// 60대 = 2명
		
		int numbers[] = new int[7];
		for (int age : ages) {
			int index = age / 10;
			++numbers[index];
		}
		for (int i = 1; i<numbers.length; ++i) {
			System.out.println( i + "0대 = " + numbers[i] + " 명");
		}
		
		//깃 연동해제 하고싶어용....
		System.out.println("======================================================");
	}
}
