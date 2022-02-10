class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length - 1, max = -1;
        for (int i = len; i >= 0; i--) {
            int currNo = arr[i];
            arr[i] = max;
            max = Math.max(currNo, max);
        }
        return arr;
    }
}