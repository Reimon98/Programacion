package UT3Metodos2;

public class arrayClase {

	public static void main(String[] args) {
		int [][] regular = {{1,2,3}, {4,5,6}, {7,8,9}};
		int [][] irregular = {{1,4}, {2}, {}};
		for (int i=0; i<regular.length;i++) {
			for (int j=0; j<regular[i].length; j++) {
				System.out.println(regular[i][j]);
			}
		}
		

	}

}
