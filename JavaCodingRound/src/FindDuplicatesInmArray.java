import java.util.ArrayList;

public class FindDuplicatesInmArray {

	public static void main(String args[]) {
		int[] arr = new int[] { 10, 333, 7, 0, 4, 76, 0, 7 };
		ArrayList<Integer> dups = new ArrayList<Integer>();

		for (int i : arr) {
			int count = 0;
			for (int j : arr) {

				if (i == j) {

					count = count + 1;
				}

			}
			//
			System.out.println("Count " + count);
			if (count > 1) {
				if (!dups.contains(i)) {
					dups.add(i);
				}

			}

		}
		for (int k : dups) {
			System.out.println(k);
		}
		// System.out.println(temp);

	}

}
