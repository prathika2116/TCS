import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	    Scanner sc=new Scanner(System.in);
	    String in=sc.nextLine();
	    int sum=0;
	    HashMap<Character,Integer> hs=new HashMap<>();
	    hs.put('0',0);
	    hs.put('1',1);
	    hs.put('2',2);
	    hs.put('3',3);
	    hs.put('4',4);
	    hs.put('5',5);  
	    hs.put('6',6);
	    hs.put('7',7);
	    hs.put('8',8);
	    hs.put('9',9);
	    hs.put('A',10);
	    hs.put('B',11);
	    hs.put('C',12);
	    hs.put('D',13);
	    hs.put('E',14);
	    hs.put('F',15);
	    hs.put('G',16);
	    int[] res=new int[in.length()];
	    for(int i=0;i<in.length();i++)
	    {   res[i]=hs.get(in.charAt(i));
	    }
	    for(int i=0,j=res.length-1;i<in.length();i++,j--)
	    {  sum+=Math.pow(17,i)*res[j];
	    }
	    System.out.println(sum);
	}
}
