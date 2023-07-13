import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum1=0,sum2=0;
		String in=sc.next();
		for(int i=0;i<in.length();i++)
		{
		    if(i%2==0)
		    {
		        sum1+=in.charAt(i)-'0';
		    }
		    else{
		        sum2+=in.charAt(i)-'0';
		    }
		}
		System.out.println(Math.abs(sum2-sum1));
	}
}
