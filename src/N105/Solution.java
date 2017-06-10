package N105;

import util.TreeNode;
/**
 * Created by terence on 6/9/17.
 */
public class Solution {
    public int findpos(int target, int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==target)
                return i;
        }
        return -1;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)
            return null;

        TreeNode root = new TreeNode(preorder[0]);
        if(preorder.length==1)
            return root;
        int rootpos = findpos(preorder[0],inorder);
        if(rootpos==0){
            int []inorderright = new int[preorder.length-rootpos-1];
            int []preorderright = new int[inorderright.length];
            System.arraycopy(preorder,1,preorderright,0,preorderright.length);
            System.arraycopy(inorder,rootpos+1,inorderright,0,inorderright.length);
            root.left = null;
            root.right = buildTree(preorderright,inorderright);
            return root;
        }else if(preorder.length-rootpos-1==0){
            int []inorderleft = new int[rootpos];
            int []preorderleft = new int[inorderleft.length];
            System.arraycopy(preorder,1,preorderleft,0,preorderleft.length);
            System.arraycopy(inorder,0,inorderleft,0,inorderleft.length);
            root.left = buildTree(preorderleft,inorderleft);
            root.right = null;
            return root;
        }
        int []inorderleft = new int[rootpos];
        int []inorderright = new int[preorder.length-rootpos-1];
        int []preorderleft = new int[inorderleft.length];
        int []preorderright = new int[inorderright.length];
        System.arraycopy(preorder,1,preorderleft,0,preorderleft.length);
        System.arraycopy(preorder,preorderleft.length + 1,preorderright,0,preorderright.length);
        System.arraycopy(inorder,0,inorderleft,0,inorderleft.length);
        System.arraycopy(inorder,rootpos+1,inorderright,0,inorderright.length);
        root.left = buildTree(preorderleft,inorderleft);
        root.right = buildTree(preorderright,inorderright);
        return root;
    }
}
