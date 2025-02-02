
/*
 *  USE OF NEXTLINE() AFTERR SCANNING ANY ONE VALUE: JUST USE NEXTLINE() TWO TIMES.
   
    whenever nextline() is used for scanning  after scanning any of the int,float,long etc...we have to use nextLine() statement two times
    if we use nextline() as the first one to scan there is no problem
    enterr the id:10\n ... 10 is taken ny nextint() and \n is taken by the nextline()
    because afterr scanning one value we hit enter ...enter means nextline so it directly takes the value as we hit enter i.e \n
    
    STORING OBJECTS:
    using enhanced for loop
    
    
 */

package corejavaEncapsulation;

import java.util.Scanner;

class Customer2
{
	private int id;
	private String name;
	private String email;
	private long phn;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

public class Encapsulation_pojoClass2 {
	public static void main(String []args)
	{
		Customer2 cus=new Customer2();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the id:");
		/*int id=sc.nextInt();
		cus.setId(id);*/
		cus.setId(sc.nextInt());
		System.out.println("enter the name:");
		cus.setName(sc.next());
		System.out.println("enter the email:");
		cus.setEmail(sc.next());
		System.out.println("enter the phn number:");
		cus.setPhn(sc.nextLong());
		System.out.println("enter the address:");
		sc.nextLine();
		cus.setAddress(sc.nextLine());
		 int n=sc.nextInt();
		 Customer2[] customer=new Customer2[n];
	     for(Customer2 c:customer)
	     {
	    	 System.out.println(c[0].getId()+" "+cus.getName()+" "+cus.getEmail()+" "+cus.getPhn()+" "+cus.getAddress());
	    	 
	     }
		
		
		
	}

}
