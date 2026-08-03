class Solution {
    public int maxSumWithK(int[] arr, int k) {
        // code here
        int n = arr.length;

        int[] maxSum = new int[n];
        maxSum[0] = arr[0];

        int curr = arr[0];
        for (int i = 1; i < n; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxSum[i] = curr;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) 
            sum += arr[i];

        int ans = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            ans = Math.max(ans, sum);
            ans = Math.max(ans, sum + maxSum[i - k]);
        }

        return ans;
    }
}