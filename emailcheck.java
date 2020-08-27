import java.util.Scanner;
public class emailcheck{
    public static void main(String[] args) {
        boolean at = false;
        boolean period = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your email: ");
        String input = scan.nextLine();
        char[] sinput = input.toCharArray(); 
            for (int i=0; i<sinput.length;i++){
                if (sinput[i] == '@'){
                    at = true;
                }
            }
            if (sinput[sinput.length-4]== '.'){
                period = true;
                }
        if (at && period == true){
            System.out.print("This is a valid e-mail address!");
        }
        else{
          System.out.print("This is not a valid e-mail");
        }
    }
}