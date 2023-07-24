public class Main
{
	public static void main(String[] args) {
		int num=18,sum=0;
		int temp=num;
		while(num!=0)
		{
		    int n=num%10;
		    sum+=n;
		    num=num/10;
		}
		if(temp%sum==0)
		System.out.println(temp+"Harshed number");
		else{
		    System.out.println(temp+"not a Harshed number");
		}
	}
}
