package java.Array;

public class MultidimensionalTest {

    public static void main(String[] args) {
        int a[][] = {{1,2,3},{2,4,5},{4,4,5}}; // 2D Array
        for(int i=0 ; i <3; i++){// shows row
            for(int j=0 ; j <3; j++){ // shows columns
                System.out.print(a[i][j]+" ");// write in matrix form
            }
            System.out.println("");
        }
    }
}
