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

	public int[] sort(int[] input) {

		// this.arr = input;

		// Split
		if (input.length > 2) {
			int leftLength = input.length / 2;
			int rightLength = input.length - leftLength;

			int[] left = split(0, leftLength);
			int[] right = split(input.length - leftLength,
					input.length);

			sort(left);
			sort(right);
		}
		return input;
	} // End of the 'sort' method

	private int[] split(int start, int end) {
		int[] result = new int[end];
		for (int i = start; i < end; i++) {
			result[i] = arr[i];
		}
		return result;
	} // End of the 'split' method

	private int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = 0; i < left.length + right.length; i++) {
			if (left[leftIndex] < right[rightIndex]) {
				merged[i] = left[leftIndex];
				leftIndex++;
			} else if (left[leftIndex] >= right[rightIndex]) {
				merged[i] = right[rightIndex];
				rightIndex++;
			}
		}
		return merged;
	} // End of the 'merge' method

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

} // End of the 'MergeSort' class
