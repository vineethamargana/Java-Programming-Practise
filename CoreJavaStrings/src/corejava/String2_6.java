package corejava;

public class String2_6 {
	public static void main(String []args)
	{
		String s1="Tap";
		System.out.println(s1);
	   //	s1.concat("Academy"); //the academy will  concatinated to tap but it is not printed when we call s1 because there is no reference 
		s1=s1.concat("Academy");  // now the reference will be created and printed. s1 will get reassigned 
		System.out.println(s1);
	}
}
