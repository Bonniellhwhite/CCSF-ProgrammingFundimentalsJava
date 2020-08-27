import java.util.Scanner;
import java.util.Arrays;
class PokerHands{
//Bonnie White 
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        char goagain = 'y';
        while (goagain != 'n'){
        System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");
        System.out.println("Card 1: ");
        int card1 = scan.nextInt();
        System.out.println("Card 2");
        int card2 = scan.nextInt();
        System.out.println("Card 3");
        int card3 = scan.nextInt();
        System.out.println("Card 4: ");
        int card4 = scan.nextInt();
        System.out.println("Card 5:");
        int card5 = scan.nextInt();
        int hand[] = {card1,card2,card3,card4,card5};
        if (containsFourOfaKind(hand)){ 
            System.out.println("You have four of a kind!");
        }
        if (containsFullHouse(hand)){
            System.out.println("You have a full house!");
        }
        if (containsStraight(hand)){    
            System.out.println("You have a Straight!");
        }
        if (containsThreeOfaKind(hand)){    
            System.out.println("You have three of a kind!");
        }
        if (containsTwoPair(hand)){ 
            System.out.println("You have two pairs!");
        }
        if (containsPair(hand)){    
            System.out.println("You have a Pair!");
        }
       if (conrtainshighcard(hand)){    
            System.out.println("You have a High Card!");
        }
          else{
            
          }
        System.out.println("Would you like to play again? (y/n)");
            char again = scan.next().charAt(0);
            if(again == 'y'){
                goagain = 'y';
            }
            else{
                goagain = 'n';
            }
        }
        System.out.println("Goodbye!");
    }

    public static boolean conrtainshighcard(int hand[]) {
      int pcount = 0;
        for (int i = 0; i < hand.length; i++) {
           for (int k = i + 1; k < hand.length; k++) {
                if (hand[i] == hand[k]){
                    pcount ++;
                }
           }
        }
        if(containsStraight(hand) == false && pcount == 0){
            return true;
        }
        else{
            return false;
        }   
    }

    public static boolean  containsPair(int hand[]){
        int pcount = 0;
        for (int i = 0; i < hand.length; i++) {
           for (int k = i + 1; k < hand.length; k++) {
                if (hand[i] == hand[k]){
                    pcount ++;
                }
           }
        }
        if (pcount == 1){
            return true;
        }
        else{
            return false;
        } 
    }

    public static boolean  containsTwoPair(int hand[]){
        boolean pair = false;
        int pcount = 0;
        for (int i = 0; i < hand.length; i++) {
           for (int k = i + 1; k < hand.length; k++) {
                if (hand[i] == hand[k]){
                    pcount ++;
                }
           }
        }
        if(pcount == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean  containsThreeOfaKind(int hand[]){
        int pcount = 0;
        for (int i = 0; i < hand.length; i++){
           for (int k = i + 1; k < hand.length; k++) {
             for (int j= k+1; j < hand.length; j++){
                if (hand[i] == hand[k] && hand[j] == hand[i] && hand[j] == hand[k]){
                    pcount ++;
                }
                }
           }
        }
        if(pcount == 1 && containsFullHouse(hand) == false){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean  containsStraight(int hand[]){
        Arrays.sort(hand);
        if(hand[0] + 1 == hand[1] && hand[0] +2 == hand[2] && hand[0] +3 == hand[3] && hand[0] +4 == hand[4]){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean  containsFullHouse(int hand[]){
        boolean pair = false;
        int pcount = 0;
        for (int i = 0; i < hand.length; i++) {
           for (int k = i + 1; k < hand.length; k++) {
                if (hand[i] == hand[k]){
                    pair = true;
                    pcount ++;
                }
           }
        }
        if(pcount == 4){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean  containsFourOfaKind(int hand[]){
        int pcount = 0;
        for (int i = 0; i < hand.length; i++) {
           for (int k = i + 1; k < hand.length; k++) {
                if (hand[i] == hand[k]){
                    pcount ++;
                }
           }
        }
        if(pcount == 6){
            return true;
        }
        else{
            return false;
        }
    }
}