
public class Loops {
	public static void main(String[] args) {
		
	// a
		
		int numberA = 0;
		while(numberA <= 100) {
			if (numberA % 2 == 0){
				System.out.println(numberA);
			}	
			numberA++;
		}
		// mathmatically, 0 is considered an even number
		// so I am including it in my code.
		
	// b
		int numberB = 100;
		while(numberB > 0) {
			System.out.println(numberB);
			numberB = numberB - 3;
		}
		
	// c
		for( int i = 1; i <= 100; i = i+2) {
			System.out.println(i);
		}
	
	// d
		for( int i = 0; i <= 100; i++) {
			if( i % 3 == 0 && i % 5 == 0) {
				System.out.println("HelloWorld");
			}else if(i % 3 == 0) {
				System.out.println("Hello");
			}else if(i % 5 == 0) {
				System.out.println("World");
			}else {
				System.out.println(i);
			}
		}
	}
	
	
}
