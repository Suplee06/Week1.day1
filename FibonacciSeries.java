package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int range=10;
		int firNum=0,secNum=1,sum;
		
		System.out.println("The entered initial numbers are :"  +firNum + " and " +secNum);
		System.out.println("The range is " +range);
		
		for (int i = 1; i <=range; i++) {
			
			sum=firNum+secNum;
			firNum=secNum;
			secNum=sum;
			System.out.println(sum);
			
		}
	}

}
