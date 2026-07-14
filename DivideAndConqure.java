

public class DivideAndConqure{

    public static void printArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
        System.out.println();
    }

    //For Divide the array
    public static void mergeSort(int[] nums,int si , int ei){
        //Base case
        if(si>=ei){
            return;
        }

        //Kaam
        int mid = (si+ei)/2;
        mergeSort(nums, si, mid); //Left part
        mergeSort(nums, mid+1, ei);  //Right part
        merge(nums , si ,mid ,ei);
    }

    //To sort and merge array
    public static void merge(int[] nums , int si,int mid,int ei){
        int[] temp = new int[ei-si+1]; //To store element temporary
        int i = si; //Iterator for left part
        int j = mid+1; //Iterator for right part
        int k = 0; //Iterator  for temporary array

        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]){
                temp[k] = nums[i];
                i++; k++;
            }else{
                temp[k] = nums[j];
                j++; k++;
            }
        }

        //Now for remianing left part
        while(i <= mid){
            temp[k] = nums[i];
            i++; k++;
        }

        //For remaining right part
        while(j <= ei){
            temp[k] = nums[j];
            j++; k++;
        }

        //For copy temporary array to original array
        for(k = 0 , i = si;k < temp.length;k++,i++){
            nums[i] = temp[k];
        }
    }

    //Quick sort (for dividing arrays into smaller parts)
    public static void quickSort(int[] nums,int si , int ei){
        if(si >= ei){
            return;
        }
        int pivIdx = partition(nums,si,ei);
        quickSort(nums, si, pivIdx-1);
        quickSort(nums, pivIdx+1, ei);
    }

    //ACtual sorting happens here
    public static int partition(int[] nums,int si,int ei){
        int pivot = ei;
        int i = si-1; //To make place to add elements
        for (int j = si; j <= ei; j++) {
            if(nums[j] <= pivot){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        nums[ei] = nums[i];
        nums[i] = temp;
        return i;
    }
    //Search in rotated sorted array
    public static int searchInArray(int[] nums,int target,int si,int ei){
       
        if(si > ei){
            return -1;
        }

        //Kaam
        int mid = (si+ei)/2;

        //Base case
        if(nums[mid] == target){
            return mid;
        }

        //Target is on L1
        if(nums[si] <= nums[mid]){
            //Case a:Left
            if(nums[si] <= target && target <= nums[mid]){
                return searchInArray(nums, target, si, mid-1);
            }
            
            //Case b: Right
            else{
                return searchInArray(nums, target, mid+1, ei);
            }
        }

        //Target is on L2
        else{

            //Case a:Right
            if(nums[mid] <= target && target <= nums[ei] ){
                return searchInArray(nums, target, mid+1, ei);
            }

            //Case b: LEft
            else{
                return searchInArray(nums, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {6,3,9,5,2,8};
        //mergeSort(nums, 0, nums.length-1);
        //quickSort(nums, 0, nums.length-1);
        //printArray(nums);
        System.out.println(searchInArray(nums, 9, 0, nums.length-1));
    }
}