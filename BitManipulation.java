public class BitManipulation {
    
    public static int getIthBit(int n,int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int n , int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateBit(int n,int i , int newBit){
        if(newBit == 0){
            return clearBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    public static int clearBitsInRange(int n ,int i ,int j){
        int a = ((~0) << j+1);
        int b = ((1<<i) -1);
        int bitMask = a | b;

        return n & bitMask;
    }

    public static boolean isTwoPower(int n){
        return (n&(n-1)) == 0;
    }

    public static int checkSetBits(int n){
        int count = 0;
        int i =0;
        while( n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >>1;
        }
        return count;
    }

    public static int fastExponentions(int n , int a){
        int ans = 1;
        while( n > 0 ){
            if((n & 1) != 0){
                ans *= a;
            }
            a=a*a;
            n = n >> 1;
        }
        return ans;

    }
    public static void main(String[] args) {
       // getIthBit(10, 2);
       System.out.println(fastExponentions(3, 5));
    }
}
