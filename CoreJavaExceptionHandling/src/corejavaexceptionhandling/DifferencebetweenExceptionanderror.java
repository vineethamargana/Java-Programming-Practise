/*
 * errors:
 * -------
  1.compilation time error:
    these are the mistakes which are occur during compilation time(syntax error)
    
  2.run time error:
      these are the mistakes which are occur during run time(lack of system resources)
      ex:array index if we give max_value for n value
  
 * exception:
 * ----------
  1.compilation time:(checked exception):
  someone is ducking on exception 
  ex:classnotfound exception
  file not found exception
  
  2.run time(unchecked exception):
  this types of exeptions occur due to faulty input.
  ex:arthmitic exception
  input mismatch exception etc.
  
  
  segregation:
  type 1:
  compile time errors
  
  type2:
  run time errors
  checked exception
  unchecked exceotion
  
  by this we can observe that run time errors also the exceptions
 */


package corejavaexceptionhandling;

public class DifferencebetweenExceptionanderror {
	public static void main(String args[])
	{
		for(int i=65;i<=69;i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println("handled");
			}
		}
	}

}
