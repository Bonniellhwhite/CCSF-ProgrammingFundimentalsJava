import Java.util.scanner;
public class NumberGuesser{
public static void main(String[] args) {
//Bonnie White
         do {
        playOneGame();
        } while (shouldPlayAgain());
    }

    public static void playOneGame()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 100.");
        int min = 1,max = 100, mid;
        char butt;    
        do {
            mid = getMidpoint(min, max);
            butt = getUserResponseToGuess(mid);
            if (butt == 'h')
                min = mid;
            else if (butt == 'l')
                max = mid;
        } while (butt != 'c');
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
    
    //midpoint function
    public static int getMidpoint(int low, int high)
    {
        return (low + high) / 2;
    }

}