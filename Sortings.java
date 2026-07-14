
import java.util.Arrays;
public class Sortings {

    //Bubble Sort 
    public static void bubbleSort(int nums[]) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    //Selection Sort
    public static void selectionSort(int nums[]){
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(nums[min_index] > nums[j]){    //For decreasing order "<" just use this 
                    min_index=j;
                }
            }
            int temp = nums[min_index];
            nums[min_index] = nums[i];
            nums[i] = temp;
        }
    }

    //Insertion Sort
    public static void insertionSort(int nums[]){
        for(int i = 1; i< nums.length;i++){
            int curr = nums[i];
            int prev = i-1;
            //Finding Best position to insert
            while(prev >= 0 && nums[prev] > curr){
                nums[prev+1] = nums[prev];
                prev--;
            }

            //Insertion
            nums[prev+1] = curr;
        }
    }

    //Counting Sort
    public static void countingSort(int nums[]){

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest , nums[i]);
        }

        int count[] = new int[largest+1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        //SOrting
        int j=0;
        for(int i=0; i < count.length ;i++){
            while(count[i]> 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    //Printing Array element
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 3, 2};

        //bubbleSort(nums);
       // selectionSort(nums);
       //insertionSort(nums);
       Arrays.sort(nums);
       //countingSort(nums);
        //printArray(nums);
    }
}