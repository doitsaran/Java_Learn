
public class NumberPalindrome {

	public static void main(String args[]) {
		// 12121 // 234
		int n = 156546;
		int sum = 0;

		int temp = n;

		while (n > 0) {

			int r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("it s not a palindrome");
		}

	}

}
