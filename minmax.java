public class Main
{
	public static void main(String[] args) {
	int n=23456;
	int min=Integer.MAX_VALUE;
	int max=Integer.MIN_VALUE;
	while(n!=0)
	{
	    int num=n%10;
	    min=Math.min(min,num);
	    max=Math.max(max,num);
	    n/=10;
	}
	System.out.println("Minimum value:"+min);
	System.out.println("Maximum value:"+max);
	
	}
}
