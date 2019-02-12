
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

		Insertion incert = new Insertion();

		System.out.println("Before: ");
		printArr(a);
		a = incert.sort(a);
		System.out.println("After: ");
		printArr(a);
		System.out.println("Before: ");
		printArr(b);
		b = incert.sort(b);
		System.out.println("After: ");
		printArr(b);
		System.out.println("Before: ");
		printArr(c);
		c = incert.sort(c);
		System.out.println("After: ");
		printArr(c);
		System.out.println("Before: ");
		printArr(d);
		d = incert.sort(d);
		System.out.println("After: ");
		printArr(d);

		printArr(e);
		d = incert.sort(e);
		System.out.println("After: ");
		printArr(e);

		printArr(f);
		d = incert.sort(f);
		System.out.println("After: ");
		printArr(f);

		printArr(g);
		d = incert.sort(g);
		System.out.println("After: ");
		printArr(g);
	}

	public static void printArr(int[] in) {
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] + ", ");
		}
		System.out.println("\n");
	}

}
