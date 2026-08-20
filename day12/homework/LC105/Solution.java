class Solution {
    int pre = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] preorder, int[] inorder, int start, int end) {
        if (start > end)
            return null;

        TreeNode root = new TreeNode(preorder[pre++]);

        int i = start;
        while (inorder[i] != root.val)
            i++;

        root.left = build(preorder, inorder, start, i - 1);
        root.right = build(preorder, inorder, i + 1, end);

        return root;
    }
}