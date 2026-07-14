

public class Recursion{

    //ptinitng decreasing number
    public static void decNumber(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decNumber(n-1);
    }

    //ptinitng increasing number
    public static void incNumber(int n ){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        incNumber(n-1);
        System.out.print(n + " ");
    }

    //Find Factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //Sum
    public static int sumOfNumbers(int n){
        //int sum = 0;
        if(n == 0){
            return 0;
        }
        return n += sumOfNumbers(n-1);
    }

    //Fibonacci series
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //checking the array is sorted or not
    public static boolean isSorted(int[] arr , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    //First occurance of target element in array
    public static int firstOccurance(int[] arr , int i , int target){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
    
        return firstOccurance(arr, i+1, target);
    }

    //Last occurance of target element in array
    public static int lastOccurance(int[] arr , int i , int target){
        if(i == 0){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return lastOccurance(arr, i-1, target);
    }

    //Finding power of X
    public static int powerOfX(int x,int n){
        if(n==1){
            return x;
        }  
        return x * powerOfX(x, n-1);
        
    }

    //Optimized solution
    public static int optimizedPowerCalculation(int x , int n){
        int halfPower = optimizedPowerCalculation(x, n/2) * optimizedPowerCalculation(x, n/2);
       if(n==0){
            return 1;
       }
        // ODD powr
        if(n % 2 != 0){
           halfPower = x * halfPower;
        }

        //Default for Even Power
        return halfPower;
    }

    //Fitting tiles on 2*n floor
    public static int tillingProblem(int floorWidth){
        if(floorWidth == 0){
            return 1;
        }
        if(floorWidth ==1){
            return 1;
        }

        return tillingProblem(floorWidth -1) + tillingProblem( floorWidth -2);
    }

    //remove Duplicate elements from a string
    public static void removeDuplicateLetters(String str , int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //Kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){

            //Duplicate letter
            removeDuplicateLetters(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicateLetters(str, idx+1, newStr.append(currChar), map);
        }
    }

    //Pairing n friends in party
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }

    //Print N binaryNumbers string without not repeating 1.
    public static void binaryString(int n,int lastPlace,String str){

        if(n==0){
            System.out.println(str);
            return;
        }
        //Kaam
        binaryString(n-1, 0, str+"0");
        if(lastPlace == 0){
            binaryString(n-1, 1, str+"1");
        }
    }

    //Tower of hanoi
    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        // Base Case
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        // Step 1
        towerOfHanoi(n - 1, src, dest, helper);

        // Step 2
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Step 3
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr ={ 1,2,3,4,2,6,7,1};
        String str = "appnnacollege";
        //System.out.println("Factorial is: " + factorial(n));
        //System.out.println("Sum of N natural Numbers : " + sumOfNumbers(n));
        //System.out.println(fibonacci(n));
        //System.out.println(isSorted(arr, 0));
        //System.out.println("First occurance is found at index:" + firstOccurance(arr, 0, 3));
        //System.out.println("Last occurance is found at index:" + lastOccurance(arr, arr.length-1, 2));
        //System.out.println(optimizedPowerCalculation(2, 4));
        //System.out.println(tillingProblem(3));
        //removeDuplicateLetters(str, 0, new StringBuilder(""), new boolean[26]);
        //System.out.println(friendsPairing(4));
        //binaryString(5, 0, "");
        towerOfHanoi(3, "A", "B", "C");
    }
}