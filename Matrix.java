import java.util.*;

public class Matrix {

    public static boolean searchKey(int arr[][] , int key){
        int n=3;
        int m = 3;
        for(int i=0; i< n ; i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == key){
                    System.out.print("Key is present at index: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key is not present!");
        return false;
    }
    
    public static void main(String[] args) {
        
        int arr[][] = new int[3][3];
        int n=3;
        int m = 3;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i< n ; i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i=0; i< n ; i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        searchKey(arr , 5);
    }
}
