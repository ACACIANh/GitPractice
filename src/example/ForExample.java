package example;

public class ForExample {
	public static void main(String[] args) {
		//본인 이름을 화면에 7번 출력하세요.
		//ex) 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동 홍길동		
		for(int i=0; i<7; ++i) {
			System.out.print("하동구 ");
		}
		System.out.println("");
		System.out.println("=========================================");
		
		//1~10 범위의 정수 중 홀수를 화면에 출력하세요.
		//ex) 1     3     5     7     9   
		for(int i=0; i<10; ++i) {
			if(i % 2 != 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println("");
		System.out.println("=========================================");
		
		//1~100 범위의 정수에서 3의 배수들의 합계와 5의 배수들의 합계를 계산하여
		//3의 배수의 합계에서 5의 배수의 합계를 뺀 결과값을 출력하세요.
		//ex) 결과 = 633
		int threeSum = 0;
		int fiveSum = 0;
		for(int i=0; i<100; ++i) {
			if((i+1)%3 == 0) {
				threeSum += i+1;
			}
			if((i+1)%5 == 0) {
				fiveSum += i+1;
			}
		}
		System.out.println("결과 = " + (threeSum-fiveSum) );
		System.out.println("=========================================");
		
		//구구단 중 7단을 화면에 출력하세요.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//    ...
		//    7 * 8 = 56
		//    7 * 9 = 63		
		for(int i=0; i<9; ++i) {
			System.out.println("7 * " + (i+1) + " = " + 7*(i+1));
		}
		System.out.println("=========================================");
		
		//5!의 결과값을 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		//ex)5! = 120		
		int factorialResult = 1;
		for(int i=0; i<5; ++i) {		//의도파악이 어려움
			factorialResult *= i+1;
		}
		System.out.println("5! = " + factorialResult);
		System.out.println("=========================================");
		
		
		//두 변수에 저장된 정수값 사이의 정수들을 화면에 출력하세요.
		//단, 한 줄에 정수값이 7개씩 출력되도록 프로그램을 작성하세요.
		//ex) 36    37    38     39     40     41     42
		//    43    44    45     46     47     48     49
		//    50    51    52     53     54     55     56
		//    57
		int begin=36, end=57;
		for(int i=begin, j=0; i<end+1; ++i) {
			System.out.print(i + "\t");
			if(j < 6) {
				++j;
			}
			else {
				System.out.println("");
				j=0;							//좋지못해 ㅡ 일단넘기자
			}	
		}		
		System.out.println("");
		System.out.println("=========================================");
	}
}













