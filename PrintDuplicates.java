package week1.day2;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		char[] arr = text.toCharArray();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (count >= 0) {

					System.out.println("%");
				}
			}
			System.out.println("" + arr[i]);
		}
	}

}
