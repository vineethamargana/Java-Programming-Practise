package corejavaEncapsulation;

import java.util.Scanner;
class Custom
{
	private int id;
	private String name;
	private String email;
	private long phn;
	private String pw;
	private String add;
	
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
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
}

public class EncapsulationEx111 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enterr num of objects to be created");
		int n=sc.nextInt();
		Custom[] arr=new Custom[n];
		for(int i=0;i<arr.length;i++)
		{
			Custom c=new Custom();
			System.out.println("enter the id for"+(i+1)+"customer");
			c.setId(sc.nextInt());
			System.out.println("enter  the name for"+(i+1)+"customer");
			c.setName(sc.next());
			System.out.println("enter the email for"+(i+1)+"customer");
            c.setEmail(sc.next());
			System.out.println("enter the phn num for"+(i+1)+"customer");
            c.setPhn(sc.nextLong());
			System.out.println("enter the password for"+(i+1)+"customer");
			c.setPw(sc.next());
			System.out.println("enter the address for"+" "+(i+1)+"customer");
			sc.nextLine();
            c.setAdd(sc.nextLine());
            arr[i]=c;
		}
		for(Custom a:arr)
		{
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getEmail());
			System.out.println(a.getPhn());
			System.out.println(a.getPw());
			System.out.println(a.getAdd());
			System.out.println();
		}
	}

}
