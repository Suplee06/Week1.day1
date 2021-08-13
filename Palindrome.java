package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String A = "madam";
		String rev= "";
		
		for (int i = A.length()-1; i >= 0; i--) {
			
			rev=rev+A.charAt(i);
			
		}
		
		if (rev.equals(A)) {
			System.out.println(rev+" it is a palindrome");
			
		}
		else {
			System.out.println(rev+ " it is not a palindrome");
		}
		

	}

}
