class Solution {
    public boolean isPowerOfTwo(int n) {
        return checkPower(n,0);
    }
    public static boolean checkPower(int n,int i){
        if(Math.pow(2,i) > n){
            return false;
        }
        if(Math.pow(2,i) == n){
            return true;
        }
        return checkPower(n,i+1);
    }
}