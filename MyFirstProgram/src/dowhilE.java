import java.util.Scanner;

public class dowhilE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name ="";
		do{
			System.out.print("Enter your name");
			name =sc.nextLine();
			}while(name.isBlank());
		System.out.println("Hello"+name);
			}

	}


