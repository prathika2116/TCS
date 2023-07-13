import java.util.*;
public class Main
{
	public static void main(String[] args) {
     int x=0,y=0,inc=10;
     Scanner sc=new Scanner(System.in);
     int ans=sc.nextInt();
     char d='r';
     for(int i=0;i<ans;i++)
     {if(d=='r')
     {
         x=x+inc;
         inc=inc+10;
         d='u';
     }
     else if(d=='u')
     {
         y=y+inc;
         inc+=10;
         d='l';
     }
     else if(d=='l')
     {
         x=x-inc;
         inc+=10;
         d='d';
         
     }
     else if(d=='d')
     {
         y=y-inc;
         inc+=10;
         d='r';
     }

     }
     System.out.println("x="+x+",y="+y);
     
	}
}
