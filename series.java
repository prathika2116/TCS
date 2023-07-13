import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0,j=0;i<n;i++)
	    {if(i%2==0)
	    {
	        arr[i]=(int)Math.pow(2,j);
	    }
	    else{
	        arr[i]=(int)Math.pow(3,j);
	        j++;
	    }
	     
	    }
	      System.out.println(arr[n-1]); 
	}
}
