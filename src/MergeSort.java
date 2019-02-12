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

	public  mergeSort(int[] original) {

		int size = original.length;
		if (size == 1) {
			return ;
		} else if (size == 2) {
			if (needSwap(original[0], original[1])) {
				swap(original, original[0]);
			}
			return ;
		} else {
			int middle = size / 2;
			int[] left = new int[middle];
			int[] right = new int[size - middle];

			for (int l = 0; l < middle; l++) {
				left[l] = original[l];
			}

			for (int r = middle; r < size; r++) {
				right[r] = original[r];
			}

			mergeSort(left);
			mergeSort(right);
		}
	} // End of the 'mergeSort' method

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

} // End of the 'MergeSort' class
