import java.util.Scanner;

public class logical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter q or Q ,if you want to continue the game");
   String i = sc.next();
   if(i.equals("q") || i.equals("Q")){
	   System.out.println("you quit");
   }else
   {
	   System.out.println("you are playing the game");
   }
	}

}
