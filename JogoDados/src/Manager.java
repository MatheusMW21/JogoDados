public class Manager  {
	private Player player1;
	private Player player2;
	private int numRounds;
	
	public Manager(Player player1, Player player2, int numRounds) {
		this.player1 = player1;
		this.player2 = player2;
		this.numRounds = numRounds;
	}

	public Player playGame() {
		int player1Score = 0; //setting scores
		int player2Score = 0;
	

		for (int i = 0; i < numRounds; i++) {
			int player1Roll1 = player1.rollDice1(); //rolling the first dice
			int player1Roll2 = player1.rollDice2(); //rolling the second dice
			int sum1 = player1Roll1 + player1Roll2; 
			
			int player2Roll1 = player2.rollDice1();
			int player2Roll2 = player2.rollDice2();
			int sum2 = player2Roll1 + player2Roll2;
			
			System.out.println("Round " + (i + 1) + "\n"); //iterate the numbers of rounds
			System.out.println(player1.getName() + " rolls the first dice " + player1Roll1);
			System.out.println(player1.getName() + " rolls a second dice " + player1Roll2);
			System.out.println("Total: " + sum1 + "\n");
		
			System.out.println(player2.getName() + " rolls the first dice " + player2Roll1);
			System.out.println(player2.getName() + " rolls a second dice " + player2Roll2);
			System.out.println("Total: " + sum2 + "\n");

			if (sum1 > sum2) { //check the winner of the round
				player1Score++;
				System.out.println(player1.getName() + " wins the round!");
			} else if (sum2 > sum1) {
				player2Score++;
				System.out.println(player2.getName() + " wins the round!");
			} else {
				System.out.println("It's a tie!");
			}
			
			System.out.println();

		}
		
		//determinate the winner
		if (player1Score > player2Score) {
			return player1;
		} else if (player2Score > player1Score) {
			return player2;
		} else {
			return null;
		}
	}

}
