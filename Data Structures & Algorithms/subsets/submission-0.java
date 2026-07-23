class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sol=new ArrayList<>();
        solve(sol,new ArrayList<>(),0,nums);
        return sol;
    }
    public void solve(List<List<Integer>> ans,List<Integer> sol,int idx,int nums[]){
        if(idx==nums.length ){
            if(!ans.contains(sol))
            ans.add(new ArrayList<>(sol));
            return;
        }
        sol.add(nums[idx]);
        solve(ans,sol,idx+1,nums);
        sol.remove(sol.size()-1);
        solve(ans,sol,idx+1,nums);
    }
}
