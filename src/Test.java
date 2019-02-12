
public class Test {

	public static void main(String[] args) {
		int[] a = {
				1 };
		int[] b = {
				2, 1 };
		int[] c = {
				1, 2 };
		int[] d = {
				5, 4, 3, 2, 1 };
		int[] e = {
				1, 1, 2, 3, 4, 5 };
		int[] f = {
				1, 2, 3, 3, 4, 5 };
		int[] g = {
				1, 2, 3, 4, 5, 5 };

		int[] h = {
				5, 5, 4, 3, 2, 1 };
		int[] i = {
				5, 5, 5, 4, 3, 2, 1 };

		Insertion incert = new Insertion();
		MergeSort merge = new MergeSort();

		// System.out.println(
		// "//////////////// Insertion Sort \\\\\\\\\\\\\\\\\\\\n");
		// System.out.println("Before A: ");
		// printArr(a);
		// a = incert.sort(a);
		// System.out.println("After A: ");
		// printArr(a);
		// System.out.println("Before B: ");
		// printArr(b);
		// b = incert.sort(b);
		// System.out.println("After B: ");
		// printArr(b);
		// System.out.println("Before C: ");
		// printArr(c);
		// c = incert.sort(c);
		// System.out.println("After C: ");
		// printArr(c);
		// System.out.println("Before D: ");
		// printArr(d);
		// d = incert.sort(d);
		// System.out.println("After D: ");
		// printArr(d);
		//
		// System.out.println("Before E: ");
		// printArr(e);
		// e = incert.sort(e);
		// System.out.println("After E: ");
		// printArr(e);
		//
		// System.out.println("Before F: ");
		// printArr(f);
		// f = incert.sort(f);
		// System.out.println("After F: ");
		// printArr(f);
		//
		// System.out.println("Before G: ");
		// printArr(g);
		// g = incert.sort(g);
		// System.out.println("After G: ");
		// printArr(g);
		//
		// System.out.println("Before H: ");
		// printArr(h);
		// h = incert.sort(h);
		// System.out.println("After H: ");
		// printArr(h);
		//
		// System.out.println("Before I: ");
		// printArr(i);
		// i = incert.sort(i);
		// System.out.println("After I: ");
		// printArr(i);

		System.out.println(
				"//////////////// Merge Sort \\\\\\\\\\\\\\\\\\\\n");
		System.out.println("Before A: ");
		printArr(a);
		merge.mergeSort(a);
		System.out.println("After A: ");
		printArr(a);
		System.out.println("Before B: ");
		printArr(b);
		merge.mergeSort(b);
		System.out.println("After B: ");
		printArr(b);
		System.out.println("Before C: ");
		printArr(c);
		merge.mergeSort(c);
		System.out.println("After C: ");
		printArr(c);
		System.out.println("Before D: ");
		printArr(d);
		merge.mergeSort(d);
		System.out.println("After D: ");
		printArr(d);

		System.out.println("Before E: ");
		printArr(e);
		merge.mergeSort(e);
		System.out.println("After E: ");
		printArr(e);

		System.out.println("Before F: ");
		printArr(f);
		merge.mergeSort(f);
		System.out.println("After F: ");
		printArr(f);

		System.out.println("Before G: ");
		printArr(g);
		merge.mergeSort(g);
		System.out.println("After G: ");
		printArr(g);

		System.out.println("Before H: ");
		printArr(h);
		merge.mergeSort(h);
		System.out.println("After H: ");
		printArr(h);

		System.out.println("Before I: ");
		printArr(i);
		merge.mergeSort(i);
		System.out.println("After I: ");
		printArr(i);
	}

	public static void printArr(int[] in) {
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] + ", ");
		}
		System.out.println("\n");
	}

}
