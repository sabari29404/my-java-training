package javaproblems;

public class SpiralMatrix {
	public static void main(String[] args) {
		
		int sVer=0;
		int sHor=0;
		int[][] matrix = {
			    { 1,  2,  3,  4 },
			    { 5,  6,  7,  8 },
			    { 9, 10, 11, 12 },
			    {13, 14, 15, 16 },
			    {17, 18, 19, 20 },
			    {21, 22, 23, 24 }
			};
		
		int ver=sVer;
		int hor=sHor;
		
		while (sVer<(matrix.length+1)/2 && sHor<(matrix[0].length+1)/2) {
			for( hor=hor;hor<matrix[sVer].length-sHor;hor++) {
				System.out.print(matrix[ver][hor]+" ");
			}
			ver++;
			hor--;
			for(ver=ver;ver<matrix.length-sVer;ver++) {
				System.out.print(matrix[ver][hor]+" ");
			}
			ver--;
			hor--;
			for(hor=hor;hor>=sHor;hor--) {
				System.out.print(matrix[ver][hor]+" ");
			}
			ver--;
			hor++;
			for(ver=ver;ver>sVer;ver--) {
				System.out.print(matrix[ver][hor]+" ");
			}
			
			sVer+=1;
			sHor+=1;
			ver=sVer;
			hor=sHor;
		}
		
		
		/*for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}*/

	}

}
