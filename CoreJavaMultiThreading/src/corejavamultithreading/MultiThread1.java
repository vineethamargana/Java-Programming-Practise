/*
  BEAN CLASS:
  the pojo class which is implementing serialisibe is called bean class.
  
  POJO CLASS:
  pojo class is the class which is having private instance variables,getters,setters,zero 
  paramiterised constructor and default constructor is called pojo class
 */

package corejavamultithreading;
class Student00 
{
	private int id;
	private String name;
	private String email;
	private int age;
	public Student00()
	{
		
	}
	public Student00(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class MultiThread1 {
	public static void main(String args[])
	{
		Student00 s=new Student00(1,"tin","tin@gmail.com",56);
		System.out.println(s.getId()+" "+s.getName()+" "+s.getEmail()+" "+s.getAge());
		System.out.println(s);
	}

}
