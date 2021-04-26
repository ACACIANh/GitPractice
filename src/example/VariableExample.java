package example;

public class VariableExample {
	public static void main(String[] args) {
		//가로의 길이가 7이고 세로의 길이가 10인 사각형의 넓이를 계산하여 출력하세요
		int horizontal = 7;
		int vertical = 10;
		int rectangle = horizontal * vertical;
		System.out.println("사각형의 넓이 = " + rectangle);
		
		//높이가 9이고 밑변의 길이가 7인 삼각형의 넓이를 계산하여 출력하세요
		int height = 9;
		int width = 7;
		double triangle = height * width * 0.5;
		System.out.println("삼각형의 넓이 = " + triangle);
		
		//10명 전체 몸무게가 759kg인 경우 평균 몸무게를 계산하여 출력하세요
		int weight = 759;
		int humanCount = 10;
		double weightAverage = (double)weight / humanCount;
		System.out.println("평균 몸무게 = " + weightAverage);
		
		//이름이 '홍길동'인 학생이 국어 89, 영어 93, 수학 95 받은경우
		//총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요
		//단 평균은 소수점 한자리만 출력하고 나머지는 버리시오
		String name = "홍길동";
		int korean = 89;
		int english = 93;
		int math = 95;
		
		int sum = korean + english + math;
		double average = (double)sum / 3;
		//double average = (double)sum / 3;
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (int)(average*10) / 10.0);

	}
}
