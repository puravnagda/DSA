class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return false;
        int rem, rev = 0, num=x;
        while(x!=0){
            rem = x%10;
            rev = rev*10+rem;
            x /= 10;
        }
        if(rev == num)
            return true;
        else
            return false;
    }
}