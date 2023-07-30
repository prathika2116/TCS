import java.util.*;
public class Main
{
	public static void main(String[] args) {
	List<Integer> li=new ArrayList<>();
	int n=11;
	for(int i=2;i<n;i++)
	{
	    if(prime(i))
	    li.add(i);
	}
	int found=0;
	for(int i=0;i<li.size();i++)
	{
	    int num1=li.get(i);
	    int num2=n-num1;
	    if(li.contains(num2))
	    {
	        found=1;
	        System.out.println("The given prime number "+n+" can be expressed as the sum of  "+num1+"+"+num2);
	        break;
	    }
	    
	}
	if(found==0)
	{
	    System.out.println("The prime number "+n+"  cannot be expreesed as sum of two numbers");
	}
	}
	static boolean prime(int n)
	{
	    int count=0;
	    for(int i=2;i*i<=n;i++)
	    {
	        if(n%i==0)
	        return false;
	         
	    }
	 
	   
	   return true;
	}
}
