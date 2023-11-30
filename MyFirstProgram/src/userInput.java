import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name:");
		String name = scanner.nextLine();
		System.out.println("hello "+name);
		System.out.println("How old are you:");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println(name +" is "+ age +" years old");
		System.out.println("what is your fav food");
		String food = scanner.nextLine();
		System.out.println("your fav food is: "+ food);
	}

}
