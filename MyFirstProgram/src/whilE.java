import java.util.Scanner;

public class whilE {
//while loop = executes a block of code as long as its condition remains true 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String name ="";
while(name.isBlank()) {
	System.out.print("Enter your name");
	name =sc.nextLine();
	}
System.out.println("Hello"+name);
	}

}
