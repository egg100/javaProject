package nestedClasses;

public class Tri {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int num = 1;
		for(int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = num++;
			}
		}
		
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary[i].length; j++) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i = 0; i < ary.length; i++) {
			for(int j = 0; j < ary[i].length; j++) {
				System.out.printf("%3d",ary[j][i]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < ary.length; i++) {
			for(int j = ary[i].length-1; j >= 0; j--) {
				System.out.printf("%3d",ary[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = ary.length-1; i >= 0; i--) {
			for(int j = 0; j < ary[i].length; j++) {
				System.out.printf("%-3d",ary[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
