import java.util.Scanner;
public class GuessingProgram{
public static void main(String[] args){
//Bonnie White
        do {
        playOneGame();
        } while (shouldPlayAgain());
    }

    public static void playOneGame()
    {
        Scanner scan = new Scanner(System.in);
       char ng;
       int num;
        System.out.println("Pick a number between 1 and 100.");
        RandomNumberGuesser rng = new RandomNumberGuesser(1,100);
        do {
            num = rng.getCurrentGuess();
            ng = getUserResponseToGuess(num);
            if (ng == 'h') {
                rng.higher(num);
            }
            else if (ng == 'l') {
                rng.lower(num);
            }
        } while (ng != 'c');
    }
    
    //play again function
    public static boolean shouldPlayAgain()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Great! Do you want to play again? (y/n): ");
        char input = scan.next().charAt(0);
        if (input == 'y')
            return true;
        else
            return false;
    }
    //get response function
    public static char getUserResponseToGuess(int guess)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Is it " + guess + "? (h/l/c): ");
        char response = scan.next().charAt(0);
        return response;
    }
}