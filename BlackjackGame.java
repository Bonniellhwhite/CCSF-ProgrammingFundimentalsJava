import java.util.Scanner;
import java.util.Random;
//Bonnie White
public class Blackjack{
	public static void main(String args[]){
    	System.out.println("Welcome to Blackjack!");
		System.out.println("Would you like to play? (y/n)");
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		char play = scan.next().charAt(0);
		while (play == 'y'){
			System.out.println("Dealing...");
			int dealer = (random.nextInt(21+1));
				if (dealer != 21){
					System.out.print("Your Cards: ");
					int ctotal= (random.nextInt(21)+1);
					int c1 = (random.nextInt(10)+1);
					int c2 = (random.nextInt(10)+1);
					int total = c1+c2; 
					char hit = 'y';
					System.out.println(c1 + "," + c2);
					System.out.println("Total Card Value: " + total);
					while (total < 21 && hit == 'y'){
						System.out.println("Hit? (y/n)");
						hit = scan.next().charAt(0);
						if (hit == 'y'){
							int c3 = (random.nextInt(10)+1);
							total = total + c3;
							System.out.println("Total Card Value: " + total);
						}
						else{
							hit = 'n';
						}
					}
					System.out.println();
					System.out.println("Dealer's hand: " + dealer);
					System.out.println("Your hand:" + total);
						if (total > dealer && total <= 21){
							System.out.println("Congradulations! You win!");
							System.out.println("Would you like to play again? (y/n)");
							play = scan.next().charAt(0);
						}
			
						else{
							System.out.println("Dealer Wins :( maybe next time!");
							System.out.println("Would you like to play again? (y/n)");
							play = scan.next().charAt(0);
						}
					
				} 
				else {
					System.out.println("Dealer's Hand: 21");
					System.out.println("Dealer Wins");
					System.out.println("Would you like to play again? (y/n)");
					play = scan.next().charAt(0);
				}
		}
		System.out.println("Thanks for playing! Goodbye! :)");
	}
}
