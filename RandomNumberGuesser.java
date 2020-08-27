import java.util.Random;
public class RandomNumberGuesser extends NumberGuesser{
    int guess;
    public RandomNumberGuesser(int high, int low){
        super(high, low);
        
    }

    public int getCurrentGuess(){
        Random random = new Random();
        guess = (random.nextInt(high-low + 1)+ low);
        return guess;
    }
}