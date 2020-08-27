import java.util.Scanner;
class primefinder {
   public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Pick a number");
  int cnum = sc.nextInt();
  int count = 0;
  for (int ppnum = 1; ppnum <= cnum ; ppnum++){
	  if (cnum % ppnum == 0 ){
	    count++;
	  }
  }
	if (count <= 2){
	  System.out.println("Prime");
  }
  if (count > 2){
    System.out.println("Not Prime");
  }
}
}