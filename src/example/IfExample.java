package example;

public class IfExample {
	public static void main(String[] args) {
		//������ ����� ���ڰ��� ����ϼ���.
		//��, ������ ����� ���ڰ��� �ҹ����� ��� �빮�ڷ� ��ȯ�Ͽ� ����ϼ���.
		char mun='x';
		
		if(mun >= 97) {
			mun -= 32;
		}
		
		System.out.println("mun = "+mun);
		System.out.println("============================================================");
		//������ ����� �������� 4�� ��������� �����Ͽ� ����ϼ���.
		int num=345644;
		
		if(num % 4 == 0) {
			System.out.println("4�� ����Դϴ�.");
		}
		else {
			System.out.println("4�� ����� �ƴմϴ�.");
		}
		
		
		System.out.println("============================================================");
		//���ذ� ������� ������ �����Ͽ� �⼮�ϼ���.
		// => �⵵�� 4�� ������ �������� 0�� ��� ����
		// => �� ������ �����ϴ� �⵵ �� 100���� ������ �������� 0�� ��� ���
		// => �� ������ �����ϴ� �⵵ �� 400���� ������ �������� 0�� ��� ����
		int year=2021;
		
		if(year % 400 == 0) {
			System.out.println("�����Դϴ�.");
		}
		else if(year % 100 == 0) {
			System.out.println("����Դϴ�.");
		}
		else if(year % 4 == 0) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("����Դϴ�.");
		}
		
		
		System.out.println("============================================================");
		//�̸��� [ȫ�浿]�� �л��� �������� 89��, �������� 93��, �������� 95���� ���� ���
		//������ ���, ������ ����Ͽ� �̸�, ����, ���, ������ ����ϼ���.
		// => ����,����,���� ���� �� �ϳ��� 0~100 ������ �ƴ� ��� ���α׷� ���� ����
		//    System.exit(0) : ���α׷��� ������ �����ϴ� �޼ҵ�
		// => ����� �̿��� ���� ��� : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		// => ����� �Ҽ��� ���ڸ������� ����ϰ� �������� ���� ó�� �ϼ���.

		String name = "ȫ�浿";
		int korean = 89;
		int english = 93;
		int math = 95;
		int sum = korean + english+ math;
		double average = sum / 3.0;
		char grade = '\0'; 
		
		if( (korean < 0 || 100 < korean) || 
			(english < 0 || 100 < english) || 
			(math < 0 || 100 < math) ) {
			System.out.println("������ �߸� �Ǿ���");
			System.exit(0);
		}
		switch((int)average / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';		
			break;
		}		
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + (int)(average * 100) / 100.0);
		System.out.println("���� : " + grade);
		System.out.println("============================================================");
	}
}









