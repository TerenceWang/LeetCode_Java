package N106;

import util.TreeNode;
/**
 * Created by terence on 6/11/17.
 */
public class Solution {
    public int findpos(int target, int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i]==target)
                return i;
        }
        return -1;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length==0)
            return null;

        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        if(postorder.length==1)
            return root;
        int rootpos = findpos(postorder[postorder.length-1],inorder);
        if(rootpos==0){
            int []inorderright = new int[postorder.length-rootpos-1];
            int []preorderright = new int[inorderright.length];
            System.arraycopy(postorder,0,preorderright,0,preorderright.length);
            System.arraycopy(inorder,rootpos+1,inorderright,0,inorderright.length);
            root.left = null;
            root.right = buildTree(inorderright,preorderright);
            return root;
        }else if(postorder.length-rootpos-1==0){
            int []inorderleft = new int[rootpos];
            int []preorderleft = new int[inorderleft.length];
            System.arraycopy(postorder,0,preorderleft,0,preorderleft.length);
            System.arraycopy(inorder,0,inorderleft,0,inorderleft.length);
            root.left = buildTree(inorderleft,preorderleft);
            root.right = null;
            return root;
        }
        int []inorderleft = new int[rootpos];
        int []inorderright = new int[postorder.length-rootpos-1];
        int []preorderleft = new int[inorderleft.length];
        int []preorderright = new int[inorderright.length];
        System.arraycopy(postorder,0,preorderleft,0,preorderleft.length);
        System.arraycopy(postorder,preorderleft.length,preorderright,0,preorderright.length);
        System.arraycopy(inorder,0,inorderleft,0,inorderleft.length);
        System.arraycopy(inorder,rootpos+1,inorderright,0,inorderright.length);
        root.left = buildTree(inorderleft,preorderleft);
        root.right = buildTree(inorderright,preorderright);
        return root;
    }
}