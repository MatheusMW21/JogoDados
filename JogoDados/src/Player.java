
public class Player{
	private String name;
	private int score;
	private Dice dice1;
	private Dice dice2;
	
	public Player (String name, Dice dice1, Dice dice2) {

		this.name = name;
		this.dice1 = dice1;
		this.dice2 = dice2;
	}
	
	public String getName() {
		return name;
	}
	
	public int rollDice1() {
		return dice1.roll();
	}
	
	public int rollDice2() {
		return dice2.roll();
	}

	
	public int getScore() {
		return score;
	}
	
}
