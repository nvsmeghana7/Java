
public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     	double x =2.14;
		double y =4.65;
		double z=6.987;
		double a=10.876;
		System.out.println(add(x,y,z,a));
	}
	
	
 static int add(int x,int y) {
	 return x+y;
	}
 static int add(int x,int y,int z) {
	 return x+y+z;
	}
 static int add(int x,int y,int z,int a) {
	 return x+y+z+a;
	}
 static double add(double x,double y) {
	 return x+y;
	}
 static double add(double  x,double y,double z) {
	 return x+y+z;
	}
 static double add(double x,double y,double z,double a) {
	 return x+y+z+a;
	}
}
