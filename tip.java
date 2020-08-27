import java.util.scanner;
class Problemset2bnew {

   		public static void main(String args[]){
   		Scanner scanner = new Scanner(System.in );
   		System.out.println("How much was your meal?");
   		double meal = scanner.nextDouble();
   		System.out.println("How was your service today?");
   		System.out.println("1 = Totally satisfied, 2 = Satisfied, 3 = Dissatisfied.");
   		int rate = scanner.nextInt();
   		if (rate == 1){
   			double tip = meal * 0.2;
			System.out.println("Totally satisfying service with a $"+meal+" meal equals a $" + tip+ " tip");
			}
	  	if (rate == 2){
			double tip = meal * 0.15;
			System.out.println("Satisfying service with a $"+meal+" meal equals a $" + tip+ " tip");
	  	}
	  	if (rate ==3){
			double tip = meal * 0.1;
			System.out.println("Dissatisfying service with a $"+meal+" meal equals a $" + tip+ " tip");
	  	}
	  	if (rate > 3) {
			System.out.println("Not a valid satisfaction level, please try again");
		}
   }
}
