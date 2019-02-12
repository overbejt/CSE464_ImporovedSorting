/**
 * Author: Josh Overbeck Professor: Vaskar Raychoudhurry Class: CSE
 * 464 A Description: This program is for the assignment 'Improved
 * Sorting'. The goal is to come up with an algorithm that improves on
 * the merge sort. This class file will create the object necessary to
 * perform a merge sort. Accountability: Dr. Vaskar provided this
 * template for me. I contained the 'printArr' method and the 'main'
 * method. There was also the 'insertionSort' and 'merge' and
 * 'impSort' methods. But they were both empty. I provided everything
 * else.
 * 
 * @author Josh Overbeck
 */
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
	 * Method that will check if a swap is needed.
	 * 
	 * @param left
	 *            - The left side value.
	 * @param right
	 *            - The right side value.
	 * @return - returns true if the value on the right needs to be
	 *         swapped to be before the left value.
	 */
	private boolean needSwap(int left, int right) {
		return (left >= right);
	} // End of the 'needSwap' method

	/**
	 * This is the method that will handle the swapping of values. It
	 * takes the current index, and rotates it to the left.
	 * 
	 * @param original
	 *            - The array that is being worked on.
	 * @param index
	 *            - The current index of where to swap at.
	 * @return - Sends the array back
	 */
	private int[] swap(int[] original, int index) {

		if (index >= 1) {
			int tmp = original[index - 1];
			original[index - 1] = original[index];
			original[index] = tmp;
		}
		return original;
	} // End of the 'swap' method

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
