/**
 * Author: Josh Overbeck Professor: Vaskar Raychoudhurry Class: CSE
 * 464 A Description: This program is for the assignment 'Improved
 * Sorting'. The goal is to come up with an algorithm that improves on
 * the merge sort. This class file will create the object necessary to
 * perform an insertion sort.
 * 
 * @author joshoverbeck
 */
public class Insertion {

	private int[] arr;

	// Constructor
	public Insertion() {

	}

	/**
	 * External invocation method to perform insertion sort.
	 * 
	 * @param input
	 *            - Takes in an integer array.
	 * @return - Returns the integer array.
	 */
	public int[] sort(int[] input) {
		// Initialize the array to the one supplied by user or this
		// class
		this.arr = input;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j >= 1) {
					if (needSwap(arr[j - 1], arr[j])) {
						swap(j);
					}
				}
			}
		}
		// Pass the array back
		return this.arr;
	} // End of the 'sort' method

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
	 * @param index
	 *            - The current index of where to swap at.
	 */
	private void swap(int index) {

		if (index >= 1) {
			int tmp = arr[index - 1];
			arr[index - 1] = arr[index];
			arr[index] = tmp;
		}

	} // End of the 'swap' method

} // End of the 'Insertion' class
