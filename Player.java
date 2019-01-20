
public class Player extends Person{
	
	public Player(String name, int age, int number, int height, String position) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.number = number;
		this.height = height;
		this.position = position;
	}
	private int number;
	private int height;
	private String position;

}
