class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefixSum = new int[gain.length+1];
        prefixSum[0]=0;
        int max = 0;
        for(int i= 1; i<prefixSum.length; i++){
            prefixSum[i] = prefixSum[i-1] + gain[i-1];
            if(prefixSum[i]>max){
                max=prefixSum[i];
            }
        }
        return max;
        
    }
}

