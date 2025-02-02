/*
1. Design a Customer class in Java with private attributes for customer information,
including`id`, `name`, `email`, `phone`, `password`, and `address`. Implement
encapsulation by providing appropriate getters and setters for each attribute.
Create one object of Customer & take the inputs from the user, set the values &
display the values using setter and getters.
Sample Input:
Alex
alex@gmail.com
9988776655
Alex@123
Btm layout, Bengaluru
Sample Output:
1
Alex
alex@gmail.com
9988776655
Alex@123
Btm layout, Bengaluru
 */


package preparationEncapsulation;

import java.util.Scanner;

class Customer
{
	private int id;
	private String name;
	private String email;
	private long phn;
	private String password;
	private String address;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
public class Example1 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
			Customer c=new Customer();
			c.setId(sc.nextInt());
			c.setName(sc.next());
			c.setEmail(sc.next());
			c.setPhn(sc.nextLong());
			c.setPassword(sc.next());
			sc.nextLine();
			c.setAddress(sc.nextLine());
			
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getEmail());
			System.out.println(c.getPhn());
			System.out.println(c.getPassword());
			System.out.println(c.getAddress());
		}
	}


