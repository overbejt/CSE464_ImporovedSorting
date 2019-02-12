public class ImprovedSort {

	private static void insertionSort(int[] arr) {
		// Implement insertion sort, might need to modify parameters
	} // End of the 'insertionSort' method

	private static void merge(int[] arr) {
		// Implement merge part here, might need to modify parameters
	} // End of the 'merge' sort method

	private static void impSort(int[] arr) {

	} // End of the 'impSort' method

	/**
	 * This is a method that was provided by Dr. Vaskar.
	 * 
	 * @param arr
	 *            - The array that is to be printed out.
	 */
	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	} // End of the 'printArr' method

	// Driver code -------- no need to touch
	public static void main(String[] args) {
		int[] testArr = new int[320];
		for (int i = 0; i < testArr.length; i++)
			testArr[i] = (int) (Math.random() * 1000);
		System.out.println("Before Sorting:");
		printArr(testArr);

		impSort(testArr);

		System.out.println("After sorting:");
		printArr(testArr);
	} // End of the 'main' method
} // End of the 'ImprovedSort' class
