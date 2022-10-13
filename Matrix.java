import java.util.*;
public class Matrix
{
    int[][] trans(int mat[][],int n)
    {
        int[][] tem=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                tem[j][i]=mat[i][j];
            }
        }
        return tem;
    }
    int[][] multi(int mat1[][],int mat2[][],int n)
    {
        int result[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
			result[i][j] = 0;
        		for (int k = 0; k < n; k++) {
          			result[i][j] += mat1[i][k] * mat2[k][j];
        		}
        	}
	}
        return result;
    }
	public static void main(String[] args) {
	    Scanner hs=new Scanner(System.in);
	    System.out.print("enter the number of rows or columns = ");
	    int n=hs.nextInt();
	    int mat1[][]=new int[n][n];
	    int mat2[][]=new int[n][n];
	    int trans1[][];
	    int trans2[][];
	    int result[][];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            System.out.print("enter the element in row "+(i+1)+" and column "+(j+1)+" for matrix 1 = ");
	            mat1[i][j]=hs.nextInt();
	        }
	    }
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            System.out.print("enter the element in row "+(i+1)+" and column "+(j+1)+" for matrix 2 = ");
	            mat2[i][j]=hs.nextInt();
	        }
	    }
	    Matrix k=new Matrix();
	    trans1=k.trans(mat1,n);
	    trans2=k.trans(mat2,n);
	    result=k.multi(trans1,trans2,n);
		
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            System.out.print(result[i][j]+" ");
	        }
	        System.out.println();
	    }
	
	}
}
