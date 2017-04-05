/* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;
*/

static Node lca(Node root,int v1,int v2)
    {
        if((root.data>v1 && root.data<v2) || (root.data<v1 && root.data>v2) || root.data==v1 || root.data==v2){
            return root;
        }

        else{
            Node temp = root;
            if(temp.data > v1){
                temp = lca(temp.left,v1,v2);
            }
            else{
                temp = lca(temp.right,v1,v2);
            }
        }
    return root;
    }
