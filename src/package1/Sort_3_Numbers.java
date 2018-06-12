package package1;

public class Sort_3_Numbers {

	public static void main(String[] args) {
		
		int a = 4, b = 30, c = 16;
		int temp = 0;
		
		if(a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if(a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		
		if(b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		

		System.out.println(a +" < " + b +" < " + c);
	}

}
