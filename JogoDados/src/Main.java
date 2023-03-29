
public class Main {
	public static void main (String[] args) {
		Dice dice1 = new Dice(6); 
		Dice dice2 = new Dice(6); 
		Player player1 = new Player("Player 1", dice1, dice2); 
		
		Player player2 = new Player("Player 2", dice1, dice2);
		
		Manager game = new Manager(player1, player2, 3); 
		Player winner = game.playGame(); 
		
		if (winner == null) {
			System.out.println("It's a tie!"); 
		} else {
			System.out.println(winner.getName() + " wins the game!"); 
		}
		
	}	
}
