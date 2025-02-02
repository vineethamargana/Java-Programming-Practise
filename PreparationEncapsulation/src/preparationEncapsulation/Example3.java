package preparationEncapsulation;

import java.util.Scanner;

class Customer2
{
	private int id;
	private String name;
	private String email;
	private long phn;
	private String password;
	private String address;
	public Customer2(int id,String name,String email,long phn,String password,String address)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.phn=phn;
		this.password=password;
		this.address=address;	
	}
	public int getid()
	{
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
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

public class Example3 {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String[] ar=s.split(",");
	
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=c
		}
	}

}


