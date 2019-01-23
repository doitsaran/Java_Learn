
public class Fibnocci {

	public static void main(String args[])

	{
		// printFib(10);
		for (int i = 0; i <= 10; i++) {
			System.out.println(fibonacci(i));
		}
		// 1 1 2 3 5 8
	}

	public static void printFib(int n) {
		int t1 = 0;
		int t2 = 1;

		int i = 0;
		while (t1 <= n) {
			

			int sum = t1 + t2;
			System.out.println(t1);
			t1 = t2;
			t2 = sum;
			i++;

		}

	}

	public static long fibonacci(int n) {

		if (n <= 1)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
