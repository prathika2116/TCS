import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String sf1="",sf2="",sf3="";
	    String s1=sc.next();
	    String s2=sc.next();
	    String s3=sc.next();
	    for(int i=0;i<s1.length();i++)
	    {   char c=s1.charAt(i);
	        if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
	      sf1+='*';
	      else{
	          sf1+=c;
	      }
	    }
	     for(int i=0;i<s2.length();i++)
	    {char c=s2.charAt(i);
	        if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u')
	      sf2+=c;
	      else{
	          sf2+='@';
	      }
	    }
	    sf3=s3.toUpperCase();
	    System.out.println(sf1);
	    System.out.println(sf2);
	    System.out.println(sf3);
	}
}
