 class Solution {
    HashMap<Long, Integer> map = new HashMap<>();

    public int pathSum(TreeNode root, int targetSum) {
        map.put(0L, 1);
        return dfs(root, 0, targetSum);
    }

    int dfs(TreeNode root, long sum, int target) {
        if (root == null)
            return 0;

        sum += root.val;

        int count = map.getOrDefault(sum - target, 0);

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        count += dfs(root.left, sum, target);
        count += dfs(root.right, sum, target);

        map.put(sum, map.get(sum) - 1);

        return count;
    }
}