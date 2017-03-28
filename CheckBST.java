/*
The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
     Input param - call the checkBST(Node root) function with the root of the binary tree
*/

    boolean CheckBST(Node root) {
       return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    // Using an overloaded helper function
    boolean checkBST(Node node, int min, int max){
        if(node == null){
            return true;
        }

        return min<node.data
            && node.data<max
            && checkBST(node.left,min,node.data)
            && checkBST(node.right,node.data,max);
    }
