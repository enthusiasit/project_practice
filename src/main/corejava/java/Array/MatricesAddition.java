package java.Array;

public class MatricesAddition {

    public static void main(String[] args) {

        // creating 3*3 two matrix

        int a[][]= { {1,3,4},{2,5,8},{6,7,9}};
        int b[][] = { {2,5,1},{6,2,2},{0,2,0}};

        // adding both matrices
         int c[][]= new int [3][3];
         for(int i=0;i<3;i++){
             for (int j=0;j<3;j++){
                  c[i][j] = a[i][j] + b[i][j];
                 System.out.print(" " +c[i][j]+" ");
             }
             System.out.println("");
         }
    }
}
