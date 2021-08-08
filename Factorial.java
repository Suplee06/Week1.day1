
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1=5;
		int fact=1;
		

		System.out.println("enter the number: " + a1);
		
		for (int i = 1; i <= 5; i++) {
			fact=fact*i;			
		}
		
		System.out.println("the factorial of "+ a1 +" is "+ fact);
	}

}
