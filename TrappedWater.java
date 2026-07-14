public class TrappedWater {

    public static int trappedWaterCalculator(int height[]){

        int n = height.length;

        //Calculate left max boundary - Array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1 ; i < height.length ; i++){
            if(height[i] > leftMax[i-1]){
                leftMax[i] = height[i];
            }
            else{
                leftMax[i] = leftMax[i-1];
            }
        }
       
        //Calculate Right max boundary - Array
        int rightMax[] = new int[height.length];
        
        rightMax[height.length-1] = height[height.length-1];
        for(int i = n -2 ; i >= 0 ; i--){
           rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //Loop
        int trappedWater = 0;
        for(int i =0; i < n ; i++){

            //Water level = min(let max , right max)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //Trapped Water = (water level - height) * width
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
        
        

    }

    public static void main(String[] args) {
        
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWaterCalculator(height));
    }
    
}
