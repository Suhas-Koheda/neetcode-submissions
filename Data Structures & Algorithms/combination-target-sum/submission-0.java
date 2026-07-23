class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(ans,new ArrayList<>(),0,target,nums);
        return ans;
    }
    public void solve(List<List<Integer>> ans,List<Integer> sol,int idx,int target,int nums[]){
        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(sol));
            return;
        }
        if(idx==nums.length){
            return;
        }
        sol.add(nums[idx]);
        solve(ans,sol,idx,target-nums[idx],nums);
        sol.remove(sol.size()-1);
        solve(ans,sol,idx+1,target,nums);
    }
}
