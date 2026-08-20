class Solution {
    int post = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post = postorder.length - 1;
        return build(inorder, postorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] inorder, int[] postorder, int start, int end) {
        if (start > end)
            return null;

        TreeNode root = new TreeNode(postorder[post--]);

        int i = start;
        while (inorder[i] != root.val)
            i++;

        root.right = build(inorder, postorder, i + 1, end);
        root.left = build(inorder, postorder, start, i - 1);

        return root;
    }
}