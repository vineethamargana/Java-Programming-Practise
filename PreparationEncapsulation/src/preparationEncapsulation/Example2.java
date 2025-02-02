package preparationEncapsulation;

import java.util.Scanner;

class Customer1
{
	private int id;
	private String name;
	private String email;
	private long phn;
	private String password;
	private String address;
	
	public void setid(int id)
	{
		this.id=id;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setphn(long phn)
	{
		this.phn=phn;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public int getid()
	{
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public long getPhn() {
		return phn;
	}
	public String getPassword() {
		return password;
	}
	public String getAddress() {
		return address;
	
	}	
}

public class Example2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Customer1 arr[]=new Customer1[n];
		for(int i=0;i<arr.length;i++)
		{
			Customer1 c=new Customer1();
			c.setid(sc.nextInt());
			c.setname(sc.next());
			c.setemail(sc.next());
			c.setphn(sc.nextLong());
			c.setpassword(sc.next());
			sc.nextLine();
			c.setaddress(sc.nextLine());
			arr[i]=c; 
		}
		for(Customer1 a:arr)
		{
			System.out.println(a.getid());
			System.out.println(a.getName());
			System.out.println(a.getEmail());
			System.out.println(a.getPhn());
			System.out.println(a.getPassword());
			System.out.println(a.getAddress());
		}
		
		}

}
