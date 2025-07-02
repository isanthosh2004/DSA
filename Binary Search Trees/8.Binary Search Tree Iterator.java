class BSTIterator {
    public  Stack<TreeNode> stack = new Stack<TreeNode>();

    public BSTIterator(TreeNode root) {
        pushall(root);
        
    }
    
    public int next() {
        TreeNode temp = stack.pop();
        pushall(temp.right);
        return temp.val;
        
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
        
    }
    public void pushall(TreeNode node){
        while(node !=null){
            stack.push(node);
            node = node.left;
        }
    }
}
