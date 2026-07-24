class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), 0, target, nums);
        return ans;
    }

    public void solve(List<List<Integer>> ans, List<Integer> sol,
                      int idx, int target, int nums[]) {

        if (target < 0) return;

        if (target == 0) {
            ans.add(new ArrayList<>(sol));
            return;
        }

        if (idx == nums.length) return;
        sol.add(nums[idx]);
        solve(ans, sol, idx + 1, target - nums[idx], nums);
        sol.remove(sol.size() - 1);
        while (idx + 1 < nums.length && nums[idx] == nums[idx + 1]) {
            idx++;
        }
        solve(ans, sol, idx + 1, target, nums);
    }
}