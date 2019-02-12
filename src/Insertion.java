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
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (j >= 1) {
					if (needSwap(input[j - 1], input[j])) {
						swap(input, j);
					}
				}
			}
		}
		// Pass the array back
		return input;
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

} // End of the 'Insertion' class
