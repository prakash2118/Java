class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int reversed=0;
        int original=x;
        while(x!=0){
            int digits=x%10;
            reversed=reversed*10+digits;
            x/=10;
        }
        return reversed==original;
    }
}
