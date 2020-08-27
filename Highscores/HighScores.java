import java.util.Scanner; 
public class HighScoresProgram {

	public static void main(String[] args) {
		HighScore s1 = new HighScore("",0);
		HighScore s2 = new HighScore("",0);
		HighScore s3 = new HighScore("",0);
		HighScore s4 = new HighScore("",0);
		HighScore s5 = new HighScore("",0);
		HighScore[] scores = {s1,s2,s3,s4,s5};
		System.out.println("Welcome to High Scores!");
		initialize(scores);
		sort(scores);
		display(scores);
	}

	public static void initialize(HighScore[] scores){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name for score #1: ");
		scores[0].setName(scan.nextLine());
		System.out.println("Enter the score for score #1: ");
		scores[0].setScore(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter the name for score #2: ");
		scores[1].setName(scan.nextLine());
		System.out.println("Enter the score for score #2: ");
		scores[1].setScore(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter the name for score #3: ");
		scores[2].setName(scan.nextLine());
		System.out.println("Enter the score for score #3: ");
		scores[2].setScore(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter the name for score #4: ");
		scores[3].setName(scan.nextLine());
		System.out.println("Enter the score for score #4: ");
		scores[3].setScore(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter the name for score #5: ");
		scores[4].setName(scan.nextLine());
		System.out.println("Enter the score for score #5: ");
		scores[4].setScore(Integer.parseInt(scan.nextLine()));
	}

	public static void sort(HighScore[] scores) {
		for (int i = 0; i < scores.length; i++){
		  	for (int j = i + 1; j < scores.length; j++){  
		    	if (scores[i].getScore() < scores[j].getScore()){
		      	String tempName = scores[i].getName();
		        int tempScore = scores[i].getScore();
		
		        scores[i].setName(scores[j].getName());  
		        scores[i].setScore(scores[j].getScore()); 
		
		        scores[j].setName(tempName);
		        scores[j].setScore(tempScore);
		    	}
			}
		}
	}

	public static void display(HighScore[] scores) {
		System.out.println();
	  	System.out.println("High Score:");
			for(int i = 0; i < scores.length; i++){
				System.out.println(scores[i].getName() + ": " + scores[i].getScore());
			}
	}
}