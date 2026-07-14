public class Array2D {
    
    //Spiral matrix
    public static void printSpiral(int matrix[][]){

        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while (startRow <= endRow && startCol <= endCol) { 
                
                //TOP
                for(int j = startCol; j < endCol ; j++){
                    System.out.println(matrix[startRow][j] + " ");
                }

                //Right
                for (int i = startRow+1; i <= endRow; i++) {
                    System.out.println(matrix[i][endCol] + " ");
                }

                //Bottom
                for (int j = endCol-1; j >= startCol; j--) {
                    if(startRow == endRow){
                        break;
                    }
                    System.out.println(matrix[endRow][j] + " ");
                }

                //Left
                for (int i = endRow-1; i <= startRow+1; i++) {
                    if(startCol == endCol){
                        break;
                    }
                    System.out.println(matrix[i][startCol] + " ");
                }
                startCol++;
                startCol++;
                endRow--;
                endCol--;
            
        }
        System.out.println();
    }

    public static int diagonalSum(int matrix[][]){
    
        int sum=0;
     /*                     //Time complexity O(n2)
        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
     */

        for (int i = 0; i < matrix.length; i++) {          //Time complexity O(n) //Space = O(1)
            
            //PrimaryDiagonal
           // int j = matrix.length-i-1;
            sum+=matrix[i][i];

            //Secondary Diagonal
            if(i != matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }            
        }
        return sum;
    }

    //Array must be in sorted order
    public static boolean staircaseSearch(int matrix[][] , int key){

        int row=0;
        int col = matrix.length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key is present at (" + row + "," + col + ")");
                return true;
            } 
            else if( matrix[row][col] > key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key is not found!");
        return false;
    }

    //Transpose of matrix
    public static int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;

    int[][] transpose = new int[cols][rows];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            transpose[j][i] = matrix[i][j];
        }
    }
    return transpose;
}

    public static void printArray(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
        {1,2,3,4} ,
        {5,6,7,8} ,
        {9,10,11,12} ,
        {13,14,15,16}
        };
        //printSpiral(matrix);
        //System.out.println( diagonalSum(matrix));
       // staircaseSearch(matrix, 15);

       int[][] result = transpose(matrix);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
            }
        System.out.println();
        }
    }
}
    
    

