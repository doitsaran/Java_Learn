import java.util.ArrayList;

public class sumOfdigitsInNum {
	
	
	public static void main(String args[])
	{
		int n=134242;
		int quot =1;
		int mod = 1;
		int sum=0;
		
		while (n  > 0 )
		{
			mod = n % 10;
			
			n=n /10;
			sum = sum+mod;
			
		}
		System.out.println(sum);
		
	}
	

}
