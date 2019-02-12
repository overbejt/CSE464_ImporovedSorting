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

	/**
	 * External invocation method to perform insertion sort.
	 * 
	 * @param arr
	 *            - Takes in an integer array.
	 */
	private static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j >= 1) {
					if (needSwap(arr[j - 1], arr[j])) {
						swap(arr, j);
					}
				}
			}
		}
	} // End of the 'insertionSort' method

	private static void merge(int[] arr) {
		int size = arr.length;
		if (size == 1) {
			return;
		} else if (size == 2) {
			if (needSwap(arr[0], arr[1])) {
				swap(arr, 1);
			}
			return;
		} else {
			int middle = size / 2;
			int[] left = new int[middle];
			int[] right = new int[size - middle];

			for (int l = 0; l < middle; l++) {
				left[l] = arr[l];
			}

			for (int r = 0; r + middle < size; r++) {
				right[r] = arr[r + middle];
			}

			merge(left);
			merge(right);

			assemble(arr, left, right);

		}
	} // End of the 'merge' sort method

	/**
	 * This is the method that will improve on the sorting. When there
	 * are more than 32 blocks, then it will use merge sort. Otherwise
	 * it will use insertion sort.
	 * 
	 * @param arr
	 *            - The blocks to be sorted.
	 */
	private static void impSort(int[] arr) {
		if (arr.length < 32) {
			insertionSort(arr);
		} else {
			merge(arr);
		}
	} // End of the 'impSort' method

	/**
	 * This is the method that will merge it all back together.
	 * 
	 * @param original
	 *            - The original array.
	 * @param left
	 *            - The left array.
	 * @param right
	 *            - The right array.
	 */
	private static void assemble(int[] original, int[] left,
			int[] right) {

		int lIndex = 0;
		int rIndex = 0;

		for (int i = 0; i < original.length; i++) {
			if ((lIndex < left.length) && (rIndex < right.length)) {
				if (needSwap(left[lIndex], right[rIndex])) {
					original[i] = right[rIndex];
					rIndex++;
				} else {
					original[i] = left[lIndex];
					lIndex++;
				}
			}

			// If left is empty
			else if (lIndex == left.length) {
				original[i] = right[rIndex];
				rIndex++;
			}

			// If right is empty
			else if (rIndex == right.length) {
				original[i] = left[lIndex];
				lIndex++;
			}
		}

	} // End of the 'assemble' method

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
	private static boolean needSwap(int left, int right) {
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
	private static int[] swap(int[] original, int index) {

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
