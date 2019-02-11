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
	 * @return
	 */
	public int[] sort(int[] input) {
		// Initialize the array to the one supplied by user
		this.arr = input;
		return null; // Hard coded!!
	} // End of the 'sort' method

	/**
	 * Method that will check if a swap is needed.
	 * 
	 * @param left
	 * @param right
	 * @return
	 */
	private boolean needSwap(int left, int right) {

		return (left >= right);

	} // End of the 'needSwap' method

} // End of the 'Insertion' class
