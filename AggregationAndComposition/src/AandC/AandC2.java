package AandC;
class Heart
{
	private float bpm;
	private float weight;
	public Heart(float bpm, float weight) {
		super();
		this.bpm = bpm;
		this.weight = weight;
	}
	public float getBpm() {
		return bpm;
	}
	
	public float getWeight() {
		return weight;
	}
	
}
class Brain
{
	private String colour;
	private float weight;
	public Brain(String colour, float weight) {
		super();
		this.colour = colour;
		this.weight = weight;
	}
	public String getColour() {
		return colour;
	}
	public float getWeight() {
		return weight;
	}
	
	
	
}
class bike
{
	private String name;
	private int cost;
	public bike(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	
	
}
class Books
{
	private String name;
	private int pgs;
	public Books(String name, int pgs) {
		super();
		this.name = name;
		this.pgs = pgs;
	}
	public String getName() {
		return name;
	}
	public int getPgs() {
		return pgs;
	}
	
}
class Student
{
	Heart h=new Heart(23.4f,78.6f);
	Brain b=new Brain("grey",98.6f);
	void hasA(bike bi)
	{
		System.out.println(bi.getCost());
		System.out.println(bi.getCost());
	}
	void hase()
	
}

public class AandC2 {

}
