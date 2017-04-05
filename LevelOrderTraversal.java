/*

 class Node
    int data;
    Node left;
    Node right;
*/
void LevelOrder(Node root)
 {
    if(root==null){
        System.out.println("The tree is empty!");
    }

    else{
        Queue<Node> q = new LinkedList<Node>();
        Node temp;
        q.add(root);

        while(!q.isEmpty()){
            temp = (Node)q.poll();

            System.out.print(temp.data + " ");

            if(temp.left!=null){
                q.add(temp.left);
            }

            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
 }
