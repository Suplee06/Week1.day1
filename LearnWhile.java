
public class LearnWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num =456789;
          int rem,sum = 0;
          System.out.println("enter the number to find the sum of digits :" +num );
          
          while(num!= 0) {
        	 
        	  
        	  rem=num%10;
        	  sum=sum+rem;
        	  num=num/10;
        
              
          }
          System.out.println("Sum of the number is :" +sum );
          
	}

}
