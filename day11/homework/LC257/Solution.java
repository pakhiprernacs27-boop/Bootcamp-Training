class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        find(root, "");
        return ans;
    }

    void find(TreeNode root, String path) {
        if (root == null) return;

        path += root.val;

        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }

        find(root.left, path + "->");
        find(root.right, path + "->");
    }
}