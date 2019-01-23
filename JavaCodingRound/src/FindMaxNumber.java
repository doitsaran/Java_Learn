
public class FindMaxNumber {

	public static void main(String args[])
	{
		int[] arr = new int[] {10,333,7,0,4,76};
		int temp=0;
		for(int i :arr)
		{
		    if (i >temp)
		    	temp=i;
			
		}
		System.out.println(temp);
	}

}
