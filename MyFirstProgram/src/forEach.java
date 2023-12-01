import java.util.ArrayList;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String[] animals= {"cat","dogs","rat","bird"};
for(String i:animals) {
	System.out.println((i));
		
}*/
		
		ArrayList<String> animals = new ArrayList();
		animals.add("cat");
		animals.add("dogs");
		animals.add("rat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
}
}