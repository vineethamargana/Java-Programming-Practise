package stringtraversal1;

import java.util.Scanner;

public class CountTheStringThai21 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//String s=sc.next(); it will the output as olleh for hello world ...the word world doesnot be considered.
		 count(s);
		//System.out.println(V);
		
	}
    static void count(String s)
    {
    	int cc=0,vc=0,nc=0,spc=0;
    	for(int i=0;i<s.length();i++)
    	{
    		char c=s.charAt(i);
    		if(c>='A' && c<='Z' || c>='a' && c<='z')
    		{
      		  if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'))	
    		    {
    			   vc++;
    		    }
      		  else
      		  {
      			  cc++;
      		  }
    		}
      		  else if(c>='0' && c<='9')
      		  {
      			nc++;  
      		  }
      		  else
      		  {
      			 spc++; 
    		  }
    	}
    	System.out.println(vc);
    	System.out.println(cc);
    	System.out.println(nc);
    	System.out.println(spc);
    }

}
