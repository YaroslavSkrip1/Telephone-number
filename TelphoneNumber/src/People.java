
public class People {

	private String name;
	private int number;
	public People(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", number=" + number + "]";
	}	
}
