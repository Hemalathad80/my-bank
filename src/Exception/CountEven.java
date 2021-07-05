package Exception;

public class CountEven {

	public static void main(String[] args) {

		int count = 0;

		int[] arr = new int[] { 1, 2, 3, 4, 2, 5, 1, 66, 3, 8 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}

		}
		System.out.println("The number of even numbers in the given array is : "
						+ count);

	}

}