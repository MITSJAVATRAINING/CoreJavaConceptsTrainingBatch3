
public class LoopExample {
	
	public void add(int a , int b) {
		int c = a + b;
	}
	
	public void substract() {
		int a = 10, b = 5;
		int c = a-b;
	}
	
	public void multiply(int a , int b, float c) {
		float d = a*b*c;
	}

	public static void main(String args[]) {
		System.out.println("Table of number 7 using for loop");
		for (int i = 1;i<=10; i++) {
			System.out.println(i*7);
		}
		
		int[] array = new int[10];
		System.out.println("Table of number 8 using while loop");
		int i = 1;
		int index = 0;
		while (i<=10) {
			array[index] = i*8;
			System.out.println(array[index]);
			i++;
			index++;
		}
		
		int[] array2 = new int[] {1,2,3,4,5};
		
		// {10,20,30,40,50}  - loop this array - print array by adding every no with 10.
	   /* 
	    * 20
	    * 30
	    * 40
	    * 50
	    * 60
	    * */
	
	}
}
