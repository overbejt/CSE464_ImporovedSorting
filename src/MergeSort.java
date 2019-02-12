/**
 * Author: Josh Overbeck Professor: Vaskar Raychoudhurry Class: CSE
 * 464 A Description: This program is for the assignment 'Improved
 * Sorting'. The goal is to come up with an algorithm that improves on
 * the merge sort. This class file will create the object necessary to
 * perform a merge sort.
 * 
 * @author joshoverbeck
 */
public class MergeSort {

	// Instance Array
	int[] arr;

	// Constructor
	public MergeSort() {

	} // End of the 'Constructor'

	// public static int[] mergeSort(int[] original, int size) {
	// if (size == 2) {
	// // if (needSwap(original[0], original[1])) {
	// // swap(original[0], original[1]);
	// // }
	// }
	// if (size < 2) {
	// // do nothing
	// } else {
	// int center = size / 2;
	// int[] left = new int[center];
	// int[] right = new int[size - center];
	// }
	//
	// } // End of the 'mergeSort' method

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

	/////////////////////////////////////////////////////

} // End of the 'MergeSort' class
