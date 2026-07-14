public class Pattern{

public static void hollowPattern(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){

                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}

public static void rotatedHalfPeramid(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-1; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
}
public static void main(String args[]) {

       // hollowPattern(10,7);
        rotatedHalfPeramid(5);
}
}