public class MatrixMul {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};

        int[][] result = multiplyMatrices(matrix1, matrix2);

        // Display the result
        displayMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] + matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
/*

import java.util.*;
public class MatrixMul {
	public static void main(String[] args) {
		int[][] a=new int[3][3];		
		int[][] b=new int[3][3];
		int[][] c =new int[3][3];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the values of a:");
		for(int i =0;i<3;i++)
		{
	    for(int j=0;j<3;j++)
	    {
		a[i][j]=sc.nextInt();
	    }
		}
	System.out.println("enter the values of b:");
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
		b[i][j]=sc.nextInt();
	}
	}
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
		c[i][j] = a[i][j]*b[i][j];
	}
	}
	for(int i=0;i<3;i++)
	{
		for (int j=0;j<3;j++)
		{
		System.out.print(c[i][j]+" ");
		}
		System.out.print("");
	}
	}
	}
*/