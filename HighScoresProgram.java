import java.util.Scanner; 
public class HighScoresProgram {

	public static void main(String[] args) {
		HighScore s1 = new HighScore("",0);
		HighScore s2 = new HighScore("",0);
		HighScore s3 = new HighScore("",0);
		HighScore s4 = new HighScore("",0);
		HighScore s5 = new HighScore("",0);
		HighScore scores[] = {s1,s2,s3,s4,s5};
	}

	public static void initialize(HighScores[] scores){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name for score #1: ");
		s1.setName(scan.nextLine());
		System.out.println("Enter the score for score #1: ");
		s1.setScore(scan.nextInt());
		System.out.println("Enter the name for score #2: ");
		s2.setName(scan.nextLine());
		System.out.println("Enter the score for score #2: ");
		s2.setScore(scan.nextInt());
		System.out.println("Enter the name for score #3: ");
		s3.setName(scan.nextLine());
		System.out.println("Enter the score for score #3: ");
		s3.setScore(scan.nextInt());
		System.out.println("Enter the name for score #4: ");
		s4.setName(scan.nextLine());
		System.out.println("Enter the score for score #4: ");
		s4.setScore(scan.nextInt());
		System.out.println("Enter the name for score #5: ");
		s5.setName(scan.nextLine());
		System.out.println("Enter the score for score #5: ");
		s1.setScore(scan.nextInt());
	}

	public static void sort(HighScore[] scores) {
		for (int i = 0; i < scores.length; i++){
		  	for (int j = i + 1; j < scores.length; j++){  
		    	if (scores[i].getScore() < scores[j].getScore()){
		      	String tempName = scores[i].getName();
		        int tempScore = scores[i].getScore();
		
		        scores[i].setName() = scores[j].getName();
		        scores[i].setScore() = scores[j].getScore();
		
		        scores[j].setName() = tempName;
		        scores[j].setScore() = tempScore;
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