public class Main
{
	public static void main(String[] args) {
	int n=21,sum=0;
	for(int i=1;i*i<=n;i++)
	{
	    if(n%i==0)
	    {sum+=i;
	    if(i!=n/i && n!=n/i){
	        sum+=n/i;
	    }
	    }
	  
	 }
	 if((sum-n)>0)
	 System.out.println("The number is abundent");
	 else{
	     System.out.println("The number is not abundent");
	 }
	                                                                                                                                  
	
	}
}
