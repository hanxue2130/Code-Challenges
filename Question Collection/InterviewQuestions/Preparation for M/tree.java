package Questions.Collection.Mthree;
/*
A basic tree structure to find whether the tree is balanced
*/
public class tree {
    public static class TreeNode {
        int value;
        TreeNode leftNode;
        TreeNode rightNode;

        public TreeNode(int value) {
            this.value = value;
        }
        public void setlNode(TreeNode lNode) {
            this.leftNode = lNode;
        }
        public void setrNode(TreeNode rNode) {
            this.rightNode = rNode;
        }
    }
    public static boolean isBalanced(TreeNode root){
        if(root == null) {
            return true;
        }
        return getDepth(root) == -1? false:true;
    }

    private static int getDepth(TreeNode root) {
    if(root == null)return 0;
    int leftD = getDepth(root.leftNode);
    if(leftD == -1)return -1;
    int rightD = getDepth(root.rightNode);
    if(rightD == -1) return -1;
    if(Math.abs(leftD-rightD)>1){
        return -1;
    }else{
        return 1+Math.max(leftD,rightD);
        }
    }

    public static void main(String[] args) {
        TreeNode test = new TreeNode(1);
        test.setlNode(test);
        test.leftNode = new TreeNode(2);
        test.setrNode(test);
        test.rightNode = new TreeNode(3);
        System.out.println(isBalanced(test));
    }
}
