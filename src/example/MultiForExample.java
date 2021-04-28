package example;

public class MultiForExample {
	public static void main(String[] args) {
		//★★★★★
		//★★★★
		//★★★
		//★★
		//★
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				if(i <= j) {
					System.out.print("★");	
				}
			}
			System.out.println("");
		}
		System.out.println("");
		
		//★★★★★
		//☆★★★★
		//☆☆★★★
		//☆☆☆★★
		//☆☆☆☆★
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				if(i<=j) {
					System.out.print("★");
				}
				else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
		System.out.println("");

		//★
		//★★★
		//★★★★★
		//★★★★★★★
		//★★★★★★★★★
		for(int i=0; i<5; ++i) {
			System.out.print("★");
			for(int j=0; j< 2*i; ++j) {
				System.out.print("★");	
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		//★☆☆☆★
		//☆★☆★☆
		//☆☆★☆☆
		//☆★☆★☆
		//★☆☆☆★
		for(int i=0; i<5; ++i) {			
			for(int j=0; j<5; ++j) {
				if((i+j)%4 == 0 || (i==j)) {
					System.out.print("★");
				}
				else {
					System.out.print("☆");
				}
			}
			System.out.println("");
		}
		System.out.println("");
		
		//내일와서 하자..
//		int i;
//		int j;
//		for(i=0;i<3;i++) {
//			for(j=0;j<3;j++) {
//				System.out.println("");
//			}
//		}
//		System.out.println(i);
		
		
	}
}
