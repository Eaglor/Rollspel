import java.util.Random;

public class Dice {
	private int currentValue;
	private final int sides;
	private Random random = new Random();
	
	public Dice(){
		this.sides = 6;
		roll();
	}
	
	public Dice(int sides){
		this.sides = sides;
		roll();
	}
	
	public int getSides() {
		return sides;
	}
	
	public int getValue() {
		return currentValue;
	}

	public int roll() {
		currentValue = random.nextInt(sides) + 1;
		
		return getValue();
	}
}
