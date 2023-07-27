public class Main
{
	public static void main(String[] args) {
		int i1=10,f=115;
		for(int i=i1;i<=f;i++)
		{
		    if(pallin(i))
		    {
		        System.out.println(i);
		    }
		}
		
	}
	static boolean pallin(int n)
	{   int temp=n;
	int rev=0;
	    while(n!=0){
	        int num=n%10;
	        rev=rev*10+num;
	        n=n/10;
	    }
	  return  rev==temp?true:false;
	}
}
