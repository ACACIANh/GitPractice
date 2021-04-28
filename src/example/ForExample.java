package example;

public class ForExample {
	public static void main(String[] args) {
		//���� �̸��� ȭ�鿡 7�� ����ϼ���.
		//ex) ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿 ȫ�浿		
		for(int i=0; i<7; ++i) {
			System.out.print("�ϵ��� ");
		}
		System.out.println("");
		System.out.println("=========================================");
		
		//1~10 ������ ���� �� Ȧ���� ȭ�鿡 ����ϼ���.
		//ex) 1     3     5     7     9   
		for(int i=0; i<10; ++i) {
			if(i % 2 != 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println("");
		System.out.println("=========================================");
		
		//1~100 ������ �������� 3�� ������� �հ�� 5�� ������� �հ踦 ����Ͽ�
		//3�� ����� �հ迡�� 5�� ����� �հ踦 �� ������� ����ϼ���.
		//ex) ��� = 633
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
		System.out.println("��� = " + (threeSum-fiveSum) );
		System.out.println("=========================================");
		
		//������ �� 7���� ȭ�鿡 ����ϼ���.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//    ...
		//    7 * 8 = 56
		//    7 * 9 = 63		
		for(int i=0; i<9; ++i) {
			System.out.println("7 * " + (i+1) + " = " + 7*(i+1));
		}
		System.out.println("=========================================");
		
		//5!�� ������� ����ϼ���.(5! = 5 * 4 * 3 * 2 * 1)
		//ex)5! = 120		
		int factorialResult = 1;
		for(int i=0; i<5; ++i) {		//�ǵ��ľ��� �����
			factorialResult *= i+1;
		}
		System.out.println("5! = " + factorialResult);
		System.out.println("=========================================");
		
		
		//�� ������ ����� ������ ������ �������� ȭ�鿡 ����ϼ���.
		//��, �� �ٿ� �������� 7���� ��µǵ��� ���α׷��� �ۼ��ϼ���.
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
				j=0;							//�������� �� �ϴܳѱ���
			}	
		}		
		System.out.println("");
		System.out.println("=========================================");
	}
}













