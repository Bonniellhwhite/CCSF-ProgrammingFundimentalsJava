import java.util.Scanner;
public class Main{
  public static void main(String[] args){
  	char t[] =  new char[] {' ',' ',' ',' ',' ',' ',' ',' ',' ',};    //  initialize the board 
    char xO = 'O';    //initialize XorO
    System.out.println("Here are the positions on the board:");
    System.out.println("0  | 1 | 2");
    System.out.println("---+---+---");
    System.out.println("3  | 4 | 5");
    System.out.println("---+---+---");
    System.out.println("6  | 7 | 8");
    System.out.println("Current board:");
    printBoard(t);    //print the board

    do
    {    //do {
      int p = nextPosition(t);      //get valid position

      updateBoard(p,xO,t);      //update board
      printBoard(t);     //print the board
      xO = markXorO(xO);      //update the mark
    } 
    while(!isWinner(t));     //} while (there is no winner);
    
    System.out.println(markXorO(xO) + " won the game!");      //print who won the game
  }

//vv All Methods vv
  
// prints the board
  public static void printBoard(char board[]){
    System.out.println(" "+ board[0] + " | " + board[1] + " | " + board[2]);
    System.out.println("---+---+---");
    System.out.println(" "+ board[3] + " | " + board[4] + " | " + board[5]);
    System.out.println("---+---+---");
    System.out.println(" "+ board[6] + " | " + board[7] + " | " + board[8]);
  }

// validate that a valid position was entered and that the position is not already occupied with an 'X' or'O'. It returns the correct board position number. 
  public static int nextPosition(char board[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Give a valid position: ");
    int pos = sc.nextInt();

    if(pos >= 0 && pos <= 8 && board[pos] != 'X' && board[pos] != 'O'){
      return pos;
    }
    else{
      System.out.println("Not a valid position");
      return nextPosition(board);
  	}
  }

// Alternates 'X' and 'O', and returns 'X' or 'O'. 
  public static char markXorO(char XorO) 
  {
    char xo = ' ';
    if(XorO == 'X'){
      xo = 'O';
    }
    if(XorO == 'O'){
      xo = 'X';
    }
    return xo;
  }

// updates the board
  public static void updateBoard(int position, char XorO, char board[]) 
  {
    board[position] = XorO;
  }

// returns true if a winner is found else it returns false.
  public static boolean isWinner(char board[])
  {
    if((board[0] == board[1] && board[1] == board[2] && board[0] != ' ') || 
       (board[3] == board[4] && board[4] == board[5] && board[3] != ' ') || 
       (board[6] == board[7] && board[7] == board[8] && board[6] != ' ') || 
       (board[0] == board[3] && board[3] == board[6] && board[0] != ' ') ||
       (board[1] == board[4] && board[4] == board[8] && board[1] != ' ') || 
       (board[2] == board[5] && board[5] == board[8] && board[2] != ' ') || 
       (board[0] == board[4] && board[4] == board[8] && board[0] != ' ') || 
       (board[6] == board[4] && board[4] == board[2] && board[6] != ' ')){
      return true;
	}
    else{
      return false;
    }
  }
}