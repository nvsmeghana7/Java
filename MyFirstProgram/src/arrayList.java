import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<String>> grocery =new ArrayList();

		ArrayList<String> bakery = new ArrayList();
		bakery.add("cake");
		bakery.add("cupcake");
		bakery.add("donut");
		
		ArrayList<String> veg = new ArrayList();
		veg.add("brocoli");
		veg.add("carrot");
		veg.add("zuchini");
		
		ArrayList<String> drinks = new ArrayList();
		drinks.add("soda");
		drinks.add("coffee");
		drinks.add("juice");
		
		grocery.add(bakery);
		grocery.add(veg);
		grocery.add(drinks);
		
		System.out.println(grocery.get(0).get(1));
		
	}

}
