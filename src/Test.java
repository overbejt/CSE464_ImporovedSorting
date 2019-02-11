
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
	}

	public static void printArr(int[] in) {
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i] + ", ");
		}
		System.out.println("\n");
	}

}
