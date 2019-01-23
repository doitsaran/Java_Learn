
public class BinarySearch {

	public static void main(String args[]) {

		int arr[] = new int[] { 1, 2, 10, 45, 89, 99, 909 };
		// Binary search in sorted array
		// find mid. n- number to be searched . if n >mid , search right half else left
		// half. do it recursively until u find the position

		int pos = BinarySearch.binaryFind(arr, 99);
		if (pos == -1) {
			System.out.println("number not found");
		} else {
			System.out.println("Number found in" + pos + " position");
		}

	}

	public static int binaryFind(int arr[], int searchNum) {
		int len = arr.length - 1; //

		int i = 0;
		while (i <= len - 1) {
			int mid = i + (len - 1) / 2;
			if (arr[mid] == searchNum)
				return mid;
			else if (arr[mid] > searchNum)
				len = mid - 1;
			else if (arr[mid] < searchNum)
				i = mid + 1;

		}

		return -1;

	}
}
