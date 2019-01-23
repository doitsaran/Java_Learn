
public class Factorial {

	public static void main(String args[]) {
		// 5! = 5*4*3*2*1
		// System.out.println(Factorial.calcFactorial(1));
		System.out.println(Factorial.calcFactorialRecursive(5));

	}

	public static int calcFactorial(int n) {
		int fact = 1;
		int temp = 1;
		for (int i = 1; i < n; i++) {
			if (i == 1) {
				temp = temp * (i * (i + 1));

			} else {
				temp = temp * (i + 1);

			}

		}
		fact = temp;
		return fact;
	}

	public static int calcFactorialRecursive(int n) {
		int fact = 1;
		int temp = 1;
		if (n == 1) {
			fact = 1;
		} else {
			fact = n * calcFactorialRecursive(n - 1);

			System.out.println(fact + "   " + "" + n);
		}
		return fact;
	}
}
