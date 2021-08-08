package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int primenum =13;
		boolean flag =false;
		
		System.out.println("Enter the number: " + primenum);
		
		for (int i = 2; i < primenum; i++) {
			
			if(primenum%2==0) {
				flag=true;
			break;
		}
	}
     if(flag==true) 
    	          System.out.println(+primenum+ " is a prime ");
    	 else
    		      System.out.println(+primenum+ " is not a prime ");
 		
     }
}
