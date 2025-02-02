
/*
 string tokenizer is used to chope the string
 it is an inbuild class
 for using string tokenizer we have to import it by using -----import java.util.StringTokenizer;
 we have to use hasmoretokens() method along with the String tokenizer 
 and we have to use nextToken() method
 */

/*
 there are two for loops
 1.traditional for loop  for(;;);
 2.enhanced for loop   for(:);
 */

package corejava;
import java.util.StringTokenizer;
public class StringTokenizer1 {
	public static void main(String []args)
	{
		StringTokenizer st=new StringTokenizer("java njds skg sdd"," ");
		/*	st.hasMoreTokens();
		System.out.println(st.nextToken());
		st.hasMoreTokens();
		System.out.println(st.nextToken());
		st.hasMoreTokens();
		System.out.println(st.nextToken());
		st.hasMoreTokens();
		System.out.println(st.nextToken());  */
		while(st.hasMoreTokens());
		{
			System.out.println(st.nextToken());
		}
	}
}
