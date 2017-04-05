/*
  The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }

     Input Format
     5          //number of elements in the BST
     1 2 3 4 5  //elements in the tree in insertion order
     3 5        //Two elements you need to find the LCA for
*/

    boolean checkBST(Node root) {
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }


    public boolean isBST(Node root, int min, int max) {
      if(root == null) {
        return true;
      }

    if(root.data >= max || root.data <= min) {
      return false;
    }
    
    return (isBST(root.left, min, root.data) && isBST(root.right, root.data, max));
  }
}
