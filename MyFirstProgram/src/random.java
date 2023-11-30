import java.util.Random;
public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Random r = new Random();
    int x =r.nextInt(10)+2;
    System.out.println(x);
    double y =r.nextDouble();
    System.out.println(y);
    boolean z = r.nextBoolean();
    System.out.println(z);
    
	}

}
