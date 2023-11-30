
public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2d array - an array of arrays
		/*String[][] f = new String[2][2];
		f[0][0]="1";
		f[0][1]="2";
		f[1][0]="3";
		f[1][1]="4";*/
		
		String[][] f = {{"1" ,"2"},{"3","4"}};
		
		for(int i=0;i<f.length;i++) {
			System.out.println();
			for(int j=0;j<f[i].length;j++) {
				System.out.print(f[i][j]+" ");
			}
		}
	}

}
