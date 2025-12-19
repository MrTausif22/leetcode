class Solution {
    public int numberOfSteps(int num) {
        return solve (num , 0);
    }

    static int solve(int num , int steps){
        if (num == 0 ){
            return steps;
        }
        if (num % 2 == 0){
            return solve(num/2, steps +1);
        }
        else {
            return solve(num -1, steps+1);
        }
    }
}