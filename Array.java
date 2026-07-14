public class Array {

    public static int getLargest(int arr[]){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > largest){
                largest = arr[i];
            }
            else if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Number is: " + smallest);
        return largest;
    }

    public static int binarySearch(int arr[] ,int key){
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
    

    public static String reverseArray(int arr[]){

       int start = 0 , end = arr.length-1;

       while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
       }
       
       return "Done";
    }

    public static void pairInArray(int arr[]){

        for(int i = 0 ; i <= arr.length ; i++){
            for(int j = i+1; j <= arr.length ; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subArrays(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++) {
            for(int j = i ; j<arr.length;j++){
                for(int k = i ; k <= j ; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.err.println("   | sum: " + sum);
                System.out.println();
                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Max sum of sub Arrays is: " + max);
    }

    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];

            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs , ms);
        }
        System.out.println("Max sum is : " + ms);
    }
    public static void main(String[] args) {
        int arr[] = {2,6,-3,-1,9,0,-2,7,9};
        //int key = 9;
        //System.err.println("Largest is : " + getLargest(arr));
        //System.err.println("Key is present at index : " + binarySearch(arr, key));
       // System.err.println("Reverse of arrays is " + reverseArray(arr));
        //for (int i = 0; i < arr.length; i++) {
          //  System.err.print(arr[i] + " ");
       // }
       //pairInArray(arr); 
       //subArrays(arr);
       kadanes(arr);

    }
}
