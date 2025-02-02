
/*
  POJO CLASS:
   
  A class which is having instance private variables,zero parameterised constructor,parameterised constructor,setters and getters .
 */

package corejavaEncapsulation;
class Customer
{
	private int id;
	private String name;
	private String email;
	private long phn;
	
	public Customer() 
	{
		
	}

	public Customer(int id, String name, String email, long phn)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.phn = phn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}

}

public class Encapsulation_PojaClass {
	public static void main(String []args)
	{
		
	}

}
