package Exception;

public class LargestExample {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 2, 5, 1, 66, 3, 8 };
		int largestNumber = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largestNumber) {
				largestNumber = arr[i];

			}

		}
		System.out.println("The largest number in the given array is : " + largestNumber);
		
	}
	

}
